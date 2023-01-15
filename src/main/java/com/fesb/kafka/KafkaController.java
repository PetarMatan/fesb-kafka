package com.fesb.kafka;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;
}
