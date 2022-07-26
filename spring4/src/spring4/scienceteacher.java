package spring4;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class scienceteacher implements teacher {

	@Override
	public void teach() {
		System.out.println("science techer");
		
	}

}
