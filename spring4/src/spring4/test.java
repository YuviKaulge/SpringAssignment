package spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test 
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(empconfig.class);
               emp e=	context.getBean("emp",emp.class);
              e.display();
	    
       emp1_bean e1=context.getBean("empl",emp1_bean.class);
             e1.display();
             
             mathteacher t=context.getBean("mathteacher",mathteacher.class);
             
             scienceteacher t1=context.getBean("scienceteacher",scienceteacher.class);
                     
        college c=context.getBean("college",college.class);
        c.test();
       
	   context.close();
	
	}

}
