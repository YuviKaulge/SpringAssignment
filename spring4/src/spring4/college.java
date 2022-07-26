package spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class college 
{
	@Autowired
	@Qualifier("mathteacher")
	private teacher teacher;
	
	
    public void test()
	
	{
		teacher.teach();
	}







	







	
	
	

}
