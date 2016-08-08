package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class jarcategory {
	
	public static void main(String[]args) {
		
		//you have to ask context factory
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("test");
		context.refresh();
		context.getBean("category");
		System.out.println("Bean creted successfully");
		
	}
}

