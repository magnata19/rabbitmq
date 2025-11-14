package com.davidson.consumerservice.rabbitmq.consumer;

import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class StringConsumer {

  @RabbitListener(queues = {"product.log"})
  public void receiveMessage(String message) {
    log.info("Consumidor recebeu a mensagem " + message);
  }

}
