package com.roomwits.examples.springbootinaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/")							// 映射的访问路径
	public String home() {
		return "www.roomwits.com";
	}

    @GetMapping("/echo")						// 映射的访问路径
    public String echo(String msg) {
        return "[Echo]:" + msg;
    }
}
