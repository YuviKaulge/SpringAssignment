package init_destroy;
 import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import init_destroy.hello_world;
	 
	// Driver class
	public class client {
	 
	    public static void main(String[] args)
	        throws Exception
	    {
	 
	        // Loading the Spring XML configuration
	        // file into the spring container and
	        // it will create the instance of
	        // the bean as it loads into container
	 
	        ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext( "spring2.xml");
	 
	        // It will close the spring container
	        // and as a result invokes the
	        // destroy() method
	        cap.close();
	    }
	}


