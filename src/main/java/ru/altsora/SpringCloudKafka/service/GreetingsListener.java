package ru.altsora.SpringCloudKafka.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import ru.altsora.SpringCloudKafka.model.Greetings;
import ru.altsora.SpringCloudKafka.stream.GreetingsStreams;

/**
 * @author Vergun Alexander
 */
@Component
@Log4j2
public class GreetingsListener {

    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("Received greetings: {}", greetings);
    }
}
