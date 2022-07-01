package com.roomwits.examples.springbootinaction.service.impl;

import org.springframework.stereotype.Service;

import com.roomwits.examples.springbootinaction.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
    @Override
    public String echo(String message) {
        return "[Echo]: " + message;
    }
}
