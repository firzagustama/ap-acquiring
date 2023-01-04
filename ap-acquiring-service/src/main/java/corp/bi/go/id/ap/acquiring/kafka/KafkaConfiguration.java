package corp.bi.go.id.ap.acquiring.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {
    @Bean
    public NewTopic updateKhazanahOrderQty() {
        return TopicBuilder.name("updateKhazanahOrderQty")
                .partitions(10)
                .replicas(1)
                .build();
    }

    @KafkaListener(id = "updateKhazanahOrderQty_producer", topics = "updateKhazanahOrderQty")
    public void listenUpdateKhazanahOrderQty (String in) {
        System.out.println("Send : " + in);
    }
}
