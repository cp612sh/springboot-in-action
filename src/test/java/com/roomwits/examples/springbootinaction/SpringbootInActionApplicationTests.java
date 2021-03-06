package com.roomwits.examples.springbootinaction;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import junit.framework.TestCase;


@SpringBootTest(classes = SpringbootInActionApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class SpringbootInActionApplicationTests {

	@Autowired
	SpringbootInActionApplication controller; // 注入控制器对象

	@Test
	void testHome() {
		TestCase.assertEquals(this.controller.home(), "www.roomwits.com");
	}

}
