package ucsc.gbft.entranceapi;

import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

@Component
public class TaskList {
    public BlockingQueue<TaskItem> queue = new LinkedBlockingDeque<>();

    public void insert(TaskItem t) {
        queue.offer(t);
    }

    public TaskItem poll(){
        return queue.poll();
    }
}
