package ucsc.gbft.entranceapi;

import com.sun.tools.javadoc.Start;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;
import ucsc.gbft.comm.ConfirmReply;
import ucsc.gbft.comm.ConsensusGrpc;
import ucsc.gbft.comm.StartRequest;

import java.util.concurrent.TimeUnit;

@Component
public class MessageSender {

    private ManagedChannel channel;
    private ConsensusGrpc.ConsensusBlockingStub blockingStub;

    public void buildConnection(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = ConsensusGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws  InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public boolean sendingInitMessage(double randomId, String key, String value, DeferredResult<String> t) {
        StartRequest.Builder b = ucsc.gbft.comm.StartRequest.newBuilder();
        b.setRandomId(randomId);
        b.setKey(key);
        b.setValue(value);
        StartRequest request = b.build();
        ConfirmReply reply;
        try {
            reply = this.blockingStub.startMessage(request);
            return true;
        } catch (StatusRuntimeException e) {
            t.setResult("timeout");
            return false;
        }
    }
}
