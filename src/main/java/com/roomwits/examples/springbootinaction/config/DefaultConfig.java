package com.roomwits.examples.springbootinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.roomwits.examples.springbootinaction.util.MessageUtil;

@Configuration
public class DefaultConfig {
    @Bean(name = "messageUtil")
    public MessageUtil getMessageUtil() {
        return new MessageUtil();
    }
}
