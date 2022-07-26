package spring4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class mathteacher implements teacher{

	@Override
	public void teach() {
		System.out.println("i am your math teacher");
		
	}

}
