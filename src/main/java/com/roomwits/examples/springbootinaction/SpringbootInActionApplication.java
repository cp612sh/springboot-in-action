package com.roomwits.examples.springbootinaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 										// 控制器注解
@EnableAutoConfiguration							// 使用自动注解
@SpringBootApplication
public class SpringbootInActionApplication {

	@RequestMapping("/")							// 映射的访问路径
	@ResponseBody									// Restful的返回形式
	public String home() {
		return "www.roomwits.com";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootInActionApplication.class, args);
	}

}
