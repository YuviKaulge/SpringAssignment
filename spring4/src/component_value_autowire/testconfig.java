package component_value_autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="component_value_autowire")
@PropertySource("classpath:animal.properties")
public class testconfig
{



}
