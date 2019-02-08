package com.mahendra.mumbaibank.app;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

@Configuration
@ComponentScan("com.mahendra.mumbaibank")
@EnableAspectJAutoProxy /// XML : <aop:aspectj-autoproxy/>
public class Application {
	
	@Bean
	public DataSource myDataSource(){
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		return builder.setType(EmbeddedDatabaseType.HSQL).build();
	}
	
	@Bean
	public AnnotationSessionFactoryBean hibernateSession(){
		AnnotationSessionFactoryBean bean = new AnnotationSessionFactoryBean();
		bean.setDataSource(myDataSource());
		bean.setPackagesToScan("com.mahendra.mumbaibank.entities");
		bean.getHibernateProperties().setProperty("hibernate.hbm2ddl.auto", "drop-create");
		bean.getHibernateProperties().setProperty("hibernate.show_sql", "true");
		return bean;
	}
	
	
	
}
