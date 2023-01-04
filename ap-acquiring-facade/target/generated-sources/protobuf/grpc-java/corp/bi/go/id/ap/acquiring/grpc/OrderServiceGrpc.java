package corp.bi.go.id.ap.acquiring.grpc;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: order_header_ub.proto")
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final String SERVICE_NAME = "OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest,
      corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse> getGetOrderUBMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrderUB",
      requestType = corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest.class,
      responseType = corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest,
      corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse> getGetOrderUBMethod() {
    io.grpc.MethodDescriptor<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest, corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse> getGetOrderUBMethod;
    if ((getGetOrderUBMethod = OrderServiceGrpc.getGetOrderUBMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrderUBMethod = OrderServiceGrpc.getGetOrderUBMethod) == null) {
          OrderServiceGrpc.getGetOrderUBMethod = getGetOrderUBMethod = 
              io.grpc.MethodDescriptor.<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest, corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OrderService", "getOrderUB"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("getOrderUB"))
                  .build();
          }
        }
     }
     return getGetOrderUBMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    return new OrderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getOrderUB(corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest request,
        io.grpc.stub.StreamObserver<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderUBMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOrderUBMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest,
                corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse>(
                  this, METHODID_GET_ORDER_UB)))
          .build();
    }
  }

  /**
   */
  public static final class OrderServiceStub extends io.grpc.stub.AbstractStub<OrderServiceStub> {
    private OrderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOrderUB(corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest request,
        io.grpc.stub.StreamObserver<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderUBMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrderServiceBlockingStub extends io.grpc.stub.AbstractStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse getOrderUB(corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderUBMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrderServiceFutureStub extends io.grpc.stub.AbstractStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse> getOrderUB(
        corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderUBMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORDER_UB = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ORDER_UB:
          serviceImpl.getOrderUB((corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest) request,
              (io.grpc.stub.StreamObserver<corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse>) responseObserver);
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

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getGetOrderUBMethod())
              .build();
        }
      }
    }
    return result;
  }
}
