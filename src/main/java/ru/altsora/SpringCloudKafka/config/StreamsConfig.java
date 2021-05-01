package ru.altsora.SpringCloudKafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import ru.altsora.SpringCloudKafka.stream.GreetingsStreams;

/**
 * @author Vergun Alexander
 */
@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
