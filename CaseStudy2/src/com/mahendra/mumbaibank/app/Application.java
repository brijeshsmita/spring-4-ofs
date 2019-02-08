package com.mahendra.mumbaibank.app;

import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement //Enable Declarative Transaction support
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
		bean.setHibernateProperties(new Properties());
		bean.getHibernateProperties().setProperty("hibernate.hbm2ddl.auto", "create");
		bean.getHibernateProperties().setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
		bean.getHibernateProperties().setProperty("hibernate.show_sql", "true");
		return bean;
	}
	
	/**
	 * A Utility class from Spring-ORM module
	 * @return
	 */
	@Bean
	public HibernateTemplate template(){
		return new HibernateTemplate(hibernateSession().getObject());
	}
	
	@Bean 
	public HibernateTransactionManager tx(){
		HibernateTransactionManager tx = new HibernateTransactionManager(hibernateSession().getObject());
		return tx;
	}
}
