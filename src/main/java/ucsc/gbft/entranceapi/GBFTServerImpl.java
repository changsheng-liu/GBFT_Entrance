package ucsc.gbft.entranceapi;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import ucsc.gbft.comm.*;

@GRpcService
final class GBFTServerImpl extends ConsensusGrpc.ConsensusImplBase {

    @Autowired
    private MessageList list;

    @Override
    public void confirmMessage(EndRequest req,  StreamObserver<ConfirmReply> responseObserver) {
        synchronized (list) {
            list.insert(new MessageItem(false,
                    req.getCenterId(),
                    req.getRandomId(),
                    req.getKey(),
                    req.getValue(),
                    0));
        }
        ConfirmReply reply = ConfirmReply.newBuilder().setConfirm(1).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void viewChange(ViewChangeRequest req,  StreamObserver<ConfirmReply> responseObserver) {
        synchronized (list) {
            list.insert(new MessageItem(true,
                    0,
                    0.0,
                    "",
                    "",
                    req.getTargetCenterId()));
        }
        ConfirmReply reply = ConfirmReply.newBuilder().setConfirm(1).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
