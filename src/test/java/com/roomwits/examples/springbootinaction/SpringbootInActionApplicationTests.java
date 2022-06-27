package com.roomwits.examples.springbootinaction;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.roomwits.examples.springbootinaction.controller.MessageController;
import com.roomwits.examples.springbootinaction.service.IMessageService;

import junit.framework.TestCase;


@SpringBootTest(classes = SpringbootInActionApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class SpringbootInActionApplicationTests {
	
	@Autowired
	MessageController controller; // 注入控制器对象

	@Autowired
	private IMessageService service; // 注入服务对象

	@Test
	void testHome() {
		TestCase.assertEquals(this.controller.home(), "www.roomwits.com");
	}

	@Test
	void testEcho() {
		TestCase.assertEquals(this.controller.echo("roomwits.com"), "[Echo]:roomwits.com");
	}

	@Test
	void testAop() {
		System.out.println(this.service.echo("roomwits.com"));
		TestCase.assertEquals(this.service.echo("roomwits.com"), "[Echo]: roomwits.com");
	}
}
