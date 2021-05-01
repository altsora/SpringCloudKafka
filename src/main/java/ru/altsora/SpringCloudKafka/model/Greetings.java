package ru.altsora.SpringCloudKafka.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Vergun Alexander
 */
@Data
@Builder
public class Greetings {
    private long timestamp;
    private String message;
}
