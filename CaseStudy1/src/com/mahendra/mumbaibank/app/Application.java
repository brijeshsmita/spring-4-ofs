package com.mahendra.mumbaibank.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.mahendra.mumbaibank")
@EnableAspectJAutoProxy /// XML : <aop:aspectj-autoproxy/>
public class Application {
	
	
}
