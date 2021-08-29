/**
 * 
 */
package com.study.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.kafka.producer.model.Message;

/**
 * @author rajan
 *
 */
@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;

    private static final String TOPIC = "TestTopic";

    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String message) {

        kafkaTemplate.send(TOPIC, new Message(message));

        return "Published successfully";
    }
}
