package ucsc.gbft.entranceapi;

import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

@Component
public class MessageList {
    public BlockingQueue<MessageItem> queue = new LinkedBlockingDeque<>();

    public void insert(MessageItem t) {
        queue.offer(t);
    }

    public MessageItem poll(){
        return queue.poll();
    }
}
