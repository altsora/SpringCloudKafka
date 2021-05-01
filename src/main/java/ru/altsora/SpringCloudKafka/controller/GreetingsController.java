package ru.altsora.SpringCloudKafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.altsora.SpringCloudKafka.model.Greetings;
import ru.altsora.SpringCloudKafka.service.GreetingsService;

/**
 * @author Vergun Alexander
 */
@RestController
@RequiredArgsConstructor
public class GreetingsController {
    private final GreetingsService greetingsService;

    @GetMapping("/greetings-2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {
        Greetings greetings = Greetings.builder()
                .message(message)
                .timestamp(System.currentTimeMillis())
                .build();

        greetingsService.sendGreeting(greetings);
    }
}
