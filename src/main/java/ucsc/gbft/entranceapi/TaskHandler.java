package ucsc.gbft.entranceapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.jvm.hotspot.utilities.MessageQueue;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class TaskHandler {

    @Autowired
    private TaskList taskList;

    private TaskItem currentTask;

    private HashMap<Integer, String> hostList;
    private HashMap<Integer, Integer> portList;
    private int currentMaster = 0;
    private boolean connectingToMaster;
    private int currentResponseTickets;

    @Autowired
    private MessageList messageList;

    @Autowired
    private MessageSender sender;

    @PostConstruct
    public void initTaskHandler() {
        initHosts();
        new Thread(this::execute).start();
    }

    private void initHosts() {
        hostList = new HashMap<>();
        hostList.put(0, "127.0.0.1");
        hostList.put(1, "127.0.0.1");
        hostList.put(2, "127.0.0.1");
        hostList.put(3, "127.0.0.1");
        hostList.put(4, "127.0.0.1");

        portList = new HashMap<>();
        portList.put(0, 20000);
        portList.put(1, 20001);
        portList.put(2, 20002);
        portList.put(3, 20003);
        portList.put(4, 20004);
    }

    private void execute() {
        while(true) {
            if(currentTask != null) {
                MessageItem m;
                synchronized (messageList) {
                    m = messageList.poll();
                }
                if(m == null){
                    continue;
                }

                if (m.getRandomId() == currentTask.randomNo && m.isViewChangeMessage) {
                    //TODO
                    currentTask.getResult().setResult("update failed");
                    connectingToMaster = false;
                    viewChange(currentMaster,currentMaster + 1);
                    currentTask = null;
                }else{
                    if (m.getRandomId() == currentTask.randomNo && isEnoughFeedBack(m)) {
                        currentTask.getResult().setResult("update successfully");
                        currentTask = null;
                    }else{
                        continue;
                    }
                }
            }else{
                TaskItem t;
                synchronized (taskList) {
                    t = taskList.poll();
                }
                if(t == null){
                    continue;
                }
                currentTask = t;
                startTransaction(t);
            }
        }
    }

    private void startTransaction(TaskItem t){
        if (hostList.size() < 4) {
            t.result.setResult("not enough remote center");
        }
        if (!connectingToMaster) {
            sender.buildConnection(hostList.get(currentMaster), portList.get(currentMaster));
            connectingToMaster = true;
        }
        currentResponseTickets = 0;
        boolean sendingResult = sender.sendingInitMessage(t.randomNo, t.kvItem.getKey(), t.kvItem.getValue(), t.result);
        if(!sendingResult) {
            viewChange(currentMaster, currentMaster+1);
            connectingToMaster = false;
        }
    }

    private boolean viewChange(int originalMaster, int newMaster){
        if(hostList.containsKey(newMaster)) {
            hostList.remove(originalMaster);
            portList.remove(originalMaster);
            currentMaster = newMaster;
            return true;
        }else {
            return false;
        }
    }

    private boolean isEnoughFeedBack(MessageItem m) {
        currentResponseTickets++;
        if (currentResponseTickets > hostList.size()/3*2) {
            return true;
        }
        return false;
    }
}
