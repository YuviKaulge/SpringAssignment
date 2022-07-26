package component_value_autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Animal 
{
	@Autowired
	private Cat cat;
	
	@Autowired
	private Dog dog;
	
	void calling()
	{
       dog.bow();
	}

	
	
}
