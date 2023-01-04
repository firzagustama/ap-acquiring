package corp.bi.go.id.ap.acquiring.service;

import corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBRequest;
import corp.bi.go.id.ap.acquiring.grpc.OrderHeaderUBResponse;
import corp.bi.go.id.ap.acquiring.grpc.OrderServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@GrpcService
public class OrderService extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void getOrderUB(OrderHeaderUBRequest request, StreamObserver<OrderHeaderUBResponse> responseObserver) {
        OrderHeaderUBResponse response = OrderHeaderUBResponse.newBuilder()
                .setId("1")
                .setOrderNo(request.getOrderNo())
                .setName("Firza Gustama")
                .build();
        System.out.println("request in");

        // update khazanah order qty
        String message = String.format("{\"khazanahId\":\"%s\",\"orderQty\":\"%d\"}", "13E75146-6D30-4E9C-B88C-7BA945589D10", 10);
        kafkaTemplate.send("updateKhazanahOrderQty", message);

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
