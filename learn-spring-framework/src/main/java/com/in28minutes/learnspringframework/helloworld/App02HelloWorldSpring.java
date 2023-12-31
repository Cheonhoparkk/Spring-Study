package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: 스프링 Context 실행
		try(var context = 
				new AnnotationConfigApplicationContext
						(HelloWorldConfiguration.class)) {
			//2: 스프링 프레임워크가 관리할 것을
			//HelloWorildConfiguration - @Configuration
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person5qualifier"));
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	
		}
		
		
		
		
	}

}

