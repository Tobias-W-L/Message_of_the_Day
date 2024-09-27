package com.example.emma;

import com.example.emma.service.MessageService;
import com.example.emma.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private WeatherService weatherService;
    private Message message;
    private MessageService messageService;
    @Autowired
    public void WeatherController(WeatherService weatherService){

        this.weatherService= weatherService;
    }


    @GetMapping("/weather")
    public String getWeather(@RequestParam String city){
        return weatherService.getWeather(city);
    }

    @GetMapping("/message")
    public String message(@RequestParam Integer id) {
        return messageService.getContent(id);
    }


}
