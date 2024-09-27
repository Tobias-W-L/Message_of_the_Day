package com.example.emma.service;

import com.example.emma.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.emma.Message;

@Service
public class MessageService {
    private final MessageRepository messageRepository;
    @Autowired
    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public String getContent(Long id){
        Message message = messageRepository.findById(id).orElseGet(null);
        return message.getContent();
    }

}
