package com.example.emma;

import com.example.emma.service.MessageService;
import com.example.emma.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private WeatherService weatherService;
    private MessageService messageService;
    @Autowired
    public void AppController(WeatherService weatherService, MessageService messageService){

        this.weatherService= weatherService;
        this.messageService=messageService;
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city){
        return weatherService.getWeather(city);
    }

    @GetMapping("/message")
    public ResponseEntity<String> getMessage(@RequestParam Long id) {
        String content = messageService.getContent(id);
        if (content == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Message not found");
        }
        return ResponseEntity.ok(content);
    }


}
