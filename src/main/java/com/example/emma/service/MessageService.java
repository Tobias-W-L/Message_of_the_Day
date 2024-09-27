package com.example.emma.service;

import org.springframework.stereotype.Service;
import com.example.emma.Message;

@Service
public class MessageService {
    private Message message;
    public MessageService(){};
    public MessageService(Message message){
        this.message = message;
    }

    public String getContent(Integer id){
        return this.message.getContent();
    }

}
