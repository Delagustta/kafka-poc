package com.kafkapoc.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "amigoscode",
            groupId = "groupId")
    void Listener(String data) {
        System.out.println("Listener received: " + data + " :)");

    }
}
