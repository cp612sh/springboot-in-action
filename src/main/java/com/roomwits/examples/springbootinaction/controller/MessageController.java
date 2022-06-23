package com.roomwits.examples.springbootinaction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
    @RequestMapping("/")							// 映射的访问路径
	@ResponseBody									// Restful的返回形式
	public String home() {
		return "www.roomwits.com";
	}
}
