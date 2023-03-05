package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
