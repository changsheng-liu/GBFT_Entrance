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
    private HashMap<Integer, String> ipList;
    private HashMap<Integer, Integer> portList;
    private int currentMaster;

    @Autowired
    private MessageList messageList;

    @PostConstruct
    public  void initTaskHandler() {

        new Thread(this::execute).start();
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

                if (m.isViewChange()) {
                    //TODO
                    currentTask.getResult().setResult("update failed");
                    viewChange(0,1);
                    currentTask = null;
                }else{
                    if (isEnoughFeedBack(m)) {
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
                startBusiness(t);
            }
        }
    }

    private void startBusiness(TaskItem t){

    }

    private boolean viewChange(int originalMaster, int newMaster){
        ipList.remove(originalMaster);
        portList.remove(newMaster);
        currentMaster = newMaster;
        return false;
    }

    private boolean isEnoughFeedBack(MessageItem m) {
        return false;
    }
}
