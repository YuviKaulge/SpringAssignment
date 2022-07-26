package spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring4")    //if u r using bean annotation no need to use this component scan
public class empconfig 
{
//	@Bean
//	public emp emp()                  //    method level annotation during java config
//	{
//		return new emp();
//	}
	@Bean(name="empl")
	public emp1_bean employee()//bean id is method name (default)
	{
//		emp1_bean e= new emp1_bean();
//		return e;
		emp1_bean em=new  emp1_bean();
		em.setMany(many());
		return em;
		
	}
     
	@Bean(name="man")
	public Manager many()
	{
		return new Manager();
	}
	
//	
//@Bean("col")
//	public college col()
//{
//	college c= new college();
//	c.setTeacher(teaching());
//	return c;
//		
//	}
//	
//	
//	@Bean
//	public teacher teaching()
//	{
//		return new mathteacher();
//	}
//	@Bean
//public teacher teaching1()
//	{
//		return new scienceteacher();
//	}
//	
	
}
