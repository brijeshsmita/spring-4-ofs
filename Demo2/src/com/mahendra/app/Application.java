package com.mahendra.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Configuration class to be used instead of XML file
@Configuration
//Search for @Component, @Autowired and Few other annotation
//Inside classes in given package
@ComponentScan(basePackages="com.mahendra")
public class Application {

	
}
