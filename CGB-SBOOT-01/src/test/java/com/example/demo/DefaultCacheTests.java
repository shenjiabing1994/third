package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest  //这个注解描述的类也会由spring框架进行值得注入
public class DefaultCacheTests {
	@Autowired
	private DefaultCache defaultCache;
	
	@Test
	public void testCache() {
		System.out.println(defaultCache);
	}
}
