package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Computer;

public class ComputerTest {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("test/computer-keyboard.xml");
		
		Computer computer=context.getBean("comId" , Computer.class);
		
		System.out.println(computer);
		
		((ClassPathXmlApplicationContext) context).close();
		
		
		
	}

}
