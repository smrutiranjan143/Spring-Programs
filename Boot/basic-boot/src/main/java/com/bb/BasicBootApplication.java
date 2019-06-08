package com.bb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bb.beans.Motor;

@SpringBootApplication
public class BasicBootApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BasicBootApplication.class, args);
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);
	}
}