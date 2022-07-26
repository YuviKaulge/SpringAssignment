package component_value_autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test 
{
	public static void main(String args[])
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(testconfig.class);
	 Dog g  =  context.getBean("dog",Dog.class);
	 System.out.println("Dog name  :"+g.getDogName());
	 
	 Animal a=context.getBean("animal",Animal.class);
	 a.calling();
	}

}
