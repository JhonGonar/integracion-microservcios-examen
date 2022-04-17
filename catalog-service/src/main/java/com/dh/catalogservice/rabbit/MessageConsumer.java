package com.dh.catalogservice.rabbit;

import com.dh.catalogservice.entity.Pattern;
import com.dh.catalogservice.entity.Serie;
import com.dh.catalogservice.service.CatalogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public record MessageConsumer(CatalogService catalogService) {
    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(Serie mediaItem){
        log.info("Consumed {} from queue", mediaItem);
        catalogService.saveNewMedia(mediaItem);
    }
}
