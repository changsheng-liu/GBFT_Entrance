package ucsc.gbft.comm;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: gbftprotocol.proto")
public final class ConsensusGrpc {

  private ConsensusGrpc() {}

  public static final String SERVICE_NAME = "gbftprotocol.Consensus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ucsc.gbft.comm.StartRequest,
      ucsc.gbft.comm.ConfirmReply> getStartMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "startMessage",
      requestType = ucsc.gbft.comm.StartRequest.class,
      responseType = ucsc.gbft.comm.ConfirmReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ucsc.gbft.comm.StartRequest,
      ucsc.gbft.comm.ConfirmReply> getStartMessageMethod() {
    io.grpc.MethodDescriptor<ucsc.gbft.comm.StartRequest, ucsc.gbft.comm.ConfirmReply> getStartMessageMethod;
    if ((getStartMessageMethod = ConsensusGrpc.getStartMessageMethod) == null) {
      synchronized (ConsensusGrpc.class) {
        if ((getStartMessageMethod = ConsensusGrpc.getStartMessageMethod) == null) {
          ConsensusGrpc.getStartMessageMethod = getStartMessageMethod = 
              io.grpc.MethodDescriptor.<ucsc.gbft.comm.StartRequest, ucsc.gbft.comm.ConfirmReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gbftprotocol.Consensus", "startMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.StartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.ConfirmReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsensusMethodDescriptorSupplier("startMessage"))
                  .build();
          }
        }
     }
     return getStartMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ucsc.gbft.comm.EndRequest,
      ucsc.gbft.comm.ConfirmReply> getConfirmMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "confirmMessage",
      requestType = ucsc.gbft.comm.EndRequest.class,
      responseType = ucsc.gbft.comm.ConfirmReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ucsc.gbft.comm.EndRequest,
      ucsc.gbft.comm.ConfirmReply> getConfirmMessageMethod() {
    io.grpc.MethodDescriptor<ucsc.gbft.comm.EndRequest, ucsc.gbft.comm.ConfirmReply> getConfirmMessageMethod;
    if ((getConfirmMessageMethod = ConsensusGrpc.getConfirmMessageMethod) == null) {
      synchronized (ConsensusGrpc.class) {
        if ((getConfirmMessageMethod = ConsensusGrpc.getConfirmMessageMethod) == null) {
          ConsensusGrpc.getConfirmMessageMethod = getConfirmMessageMethod = 
              io.grpc.MethodDescriptor.<ucsc.gbft.comm.EndRequest, ucsc.gbft.comm.ConfirmReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gbftprotocol.Consensus", "confirmMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.EndRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.ConfirmReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsensusMethodDescriptorSupplier("confirmMessage"))
                  .build();
          }
        }
     }
     return getConfirmMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ucsc.gbft.comm.ConsensusRequest,
      ucsc.gbft.comm.ConfirmReply> getClaimMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "claimMessage",
      requestType = ucsc.gbft.comm.ConsensusRequest.class,
      responseType = ucsc.gbft.comm.ConfirmReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ucsc.gbft.comm.ConsensusRequest,
      ucsc.gbft.comm.ConfirmReply> getClaimMessageMethod() {
    io.grpc.MethodDescriptor<ucsc.gbft.comm.ConsensusRequest, ucsc.gbft.comm.ConfirmReply> getClaimMessageMethod;
    if ((getClaimMessageMethod = ConsensusGrpc.getClaimMessageMethod) == null) {
      synchronized (ConsensusGrpc.class) {
        if ((getClaimMessageMethod = ConsensusGrpc.getClaimMessageMethod) == null) {
          ConsensusGrpc.getClaimMessageMethod = getClaimMessageMethod = 
              io.grpc.MethodDescriptor.<ucsc.gbft.comm.ConsensusRequest, ucsc.gbft.comm.ConfirmReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gbftprotocol.Consensus", "claimMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.ConsensusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.ConfirmReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsensusMethodDescriptorSupplier("claimMessage"))
                  .build();
          }
        }
     }
     return getClaimMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ucsc.gbft.comm.ViewChangeRequest,
      ucsc.gbft.comm.ConfirmReply> getViewChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewChange",
      requestType = ucsc.gbft.comm.ViewChangeRequest.class,
      responseType = ucsc.gbft.comm.ConfirmReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ucsc.gbft.comm.ViewChangeRequest,
      ucsc.gbft.comm.ConfirmReply> getViewChangeMethod() {
    io.grpc.MethodDescriptor<ucsc.gbft.comm.ViewChangeRequest, ucsc.gbft.comm.ConfirmReply> getViewChangeMethod;
    if ((getViewChangeMethod = ConsensusGrpc.getViewChangeMethod) == null) {
      synchronized (ConsensusGrpc.class) {
        if ((getViewChangeMethod = ConsensusGrpc.getViewChangeMethod) == null) {
          ConsensusGrpc.getViewChangeMethod = getViewChangeMethod = 
              io.grpc.MethodDescriptor.<ucsc.gbft.comm.ViewChangeRequest, ucsc.gbft.comm.ConfirmReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gbftprotocol.Consensus", "viewChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.ViewChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ucsc.gbft.comm.ConfirmReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ConsensusMethodDescriptorSupplier("viewChange"))
                  .build();
          }
        }
     }
     return getViewChangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConsensusStub newStub(io.grpc.Channel channel) {
    return new ConsensusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConsensusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConsensusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConsensusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConsensusFutureStub(channel);
  }

  /**
   */
  public static abstract class ConsensusImplBase implements io.grpc.BindableService {

    /**
     */
    public void startMessage(ucsc.gbft.comm.StartRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMessageMethod(), responseObserver);
    }

    /**
     */
    public void confirmMessage(ucsc.gbft.comm.EndRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnimplementedUnaryCall(getConfirmMessageMethod(), responseObserver);
    }

    /**
     */
    public void claimMessage(ucsc.gbft.comm.ConsensusRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnimplementedUnaryCall(getClaimMessageMethod(), responseObserver);
    }

    /**
     */
    public void viewChange(ucsc.gbft.comm.ViewChangeRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnimplementedUnaryCall(getViewChangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ucsc.gbft.comm.StartRequest,
                ucsc.gbft.comm.ConfirmReply>(
                  this, METHODID_START_MESSAGE)))
          .addMethod(
            getConfirmMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ucsc.gbft.comm.EndRequest,
                ucsc.gbft.comm.ConfirmReply>(
                  this, METHODID_CONFIRM_MESSAGE)))
          .addMethod(
            getClaimMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ucsc.gbft.comm.ConsensusRequest,
                ucsc.gbft.comm.ConfirmReply>(
                  this, METHODID_CLAIM_MESSAGE)))
          .addMethod(
            getViewChangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ucsc.gbft.comm.ViewChangeRequest,
                ucsc.gbft.comm.ConfirmReply>(
                  this, METHODID_VIEW_CHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class ConsensusStub extends io.grpc.stub.AbstractStub<ConsensusStub> {
    private ConsensusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsensusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsensusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsensusStub(channel, callOptions);
    }

    /**
     */
    public void startMessage(ucsc.gbft.comm.StartRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmMessage(ucsc.gbft.comm.EndRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConfirmMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void claimMessage(ucsc.gbft.comm.ConsensusRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClaimMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewChange(ucsc.gbft.comm.ViewChangeRequest request,
        io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewChangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConsensusBlockingStub extends io.grpc.stub.AbstractStub<ConsensusBlockingStub> {
    private ConsensusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsensusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsensusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsensusBlockingStub(channel, callOptions);
    }

    /**
     */
    public ucsc.gbft.comm.ConfirmReply startMessage(ucsc.gbft.comm.StartRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public ucsc.gbft.comm.ConfirmReply confirmMessage(ucsc.gbft.comm.EndRequest request) {
      return blockingUnaryCall(
          getChannel(), getConfirmMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public ucsc.gbft.comm.ConfirmReply claimMessage(ucsc.gbft.comm.ConsensusRequest request) {
      return blockingUnaryCall(
          getChannel(), getClaimMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public ucsc.gbft.comm.ConfirmReply viewChange(ucsc.gbft.comm.ViewChangeRequest request) {
      return blockingUnaryCall(
          getChannel(), getViewChangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConsensusFutureStub extends io.grpc.stub.AbstractStub<ConsensusFutureStub> {
    private ConsensusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConsensusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConsensusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConsensusFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ucsc.gbft.comm.ConfirmReply> startMessage(
        ucsc.gbft.comm.StartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ucsc.gbft.comm.ConfirmReply> confirmMessage(
        ucsc.gbft.comm.EndRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConfirmMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ucsc.gbft.comm.ConfirmReply> claimMessage(
        ucsc.gbft.comm.ConsensusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClaimMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ucsc.gbft.comm.ConfirmReply> viewChange(
        ucsc.gbft.comm.ViewChangeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getViewChangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_MESSAGE = 0;
  private static final int METHODID_CONFIRM_MESSAGE = 1;
  private static final int METHODID_CLAIM_MESSAGE = 2;
  private static final int METHODID_VIEW_CHANGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConsensusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConsensusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_MESSAGE:
          serviceImpl.startMessage((ucsc.gbft.comm.StartRequest) request,
              (io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply>) responseObserver);
          break;
        case METHODID_CONFIRM_MESSAGE:
          serviceImpl.confirmMessage((ucsc.gbft.comm.EndRequest) request,
              (io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply>) responseObserver);
          break;
        case METHODID_CLAIM_MESSAGE:
          serviceImpl.claimMessage((ucsc.gbft.comm.ConsensusRequest) request,
              (io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply>) responseObserver);
          break;
        case METHODID_VIEW_CHANGE:
          serviceImpl.viewChange((ucsc.gbft.comm.ViewChangeRequest) request,
              (io.grpc.stub.StreamObserver<ucsc.gbft.comm.ConfirmReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConsensusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConsensusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ucsc.gbft.comm.GBFTCommProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Consensus");
    }
  }

  private static final class ConsensusFileDescriptorSupplier
      extends ConsensusBaseDescriptorSupplier {
    ConsensusFileDescriptorSupplier() {}
  }

  private static final class ConsensusMethodDescriptorSupplier
      extends ConsensusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConsensusMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ConsensusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConsensusFileDescriptorSupplier())
              .addMethod(getStartMessageMethod())
              .addMethod(getConfirmMessageMethod())
              .addMethod(getClaimMessageMethod())
              .addMethod(getViewChangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
