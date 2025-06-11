package dev.java10x.email.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMq {
    private final String queueName = "email-queue";

    @Bean
    public Queue queue(){
        return new Queue(queueName, true);
    }
}
