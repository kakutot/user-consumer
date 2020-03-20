package com.larecette;

import com.larecette.kafka.consumer.BaseKafkaConsumer;
import com.larecette.kafka.consumer.KafkaUserCookedRecipeEventConsumer;
import com.larecette.kafka.consumer.KafkaUserEventConsumer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication()
public class App {

    public static void main(String args[]) {
        SpringApplication.run(App.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(List<BaseKafkaConsumer> kafkaUserEventConsumerList,
                                               @Qualifier(value = "createUserCookedRecipeConsumer")
                                              KafkaUserCookedRecipeEventConsumer kafkaUserCookedRecipeEventConsumer) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                //ExecutorService executorService = Executors.newCachedThreadPool();
                //kafkaUserEventConsumerList.forEach(
                 //       kafkaUserEventConsumer -> executorService.submit(kafkaUserEventConsumer::startConsume));
                kafkaUserCookedRecipeEventConsumer.startConsume();
            }
        };
    }
}
