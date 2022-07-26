package component_value_autowire;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog 
{
	
	
	private String dogName;

	
	
	public String getDogName() {
		return dogName;
	}

//	@Value("${g.dogname}")
	
	@Required
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	 void bow()
	 {
		 System.out.println("bow bow");
	 }

}
