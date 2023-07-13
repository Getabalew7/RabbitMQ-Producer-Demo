package com.codeaz.rabbitmqproducerdemo.controller;

import com.codeaz.rabbitmqproducerdemo.dto.OrderDTO;
import com.codeaz.rabbitmqproducerdemo.publisher.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("message/")
public class MessageController {

    private final RabbitMQProducer rabbitMQProducer;

    public MessageController(RabbitMQProducer rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
    }
    @PostMapping("")
    public String sendMessage(@RequestBody OrderDTO orderDTO) {
        orderDTO.setId(UUID.randomUUID());
        rabbitMQProducer.sendMessage(orderDTO);
        return "success";
    }
}
