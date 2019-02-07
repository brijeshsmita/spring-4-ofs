package com.mahendra.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.mahendra.business.CustomerManager;
import com.mahendra.dao.CustomerDAO;


// Configuration class to be used instead of XML file
@Configuration
//@PropertySource(value="classpath:db.properties")
public class Application {

	@Value("${url}")
	private String dbUrl;
	@Value("${username}")
	private String dbUser;
	@Value("${password}")
	private String dbPassword;
	
	@Bean(name="b1")
	public CustomerDAO dao(){
		return new CustomerDAO();
	}
	
	@Bean(name="b3")
	public CustomerDAO dao2(){
		return new CustomerDAO();
	}
	@Bean
	public DataSource myDataSource(){
		DataSource ds = null;
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		builder.setType(EmbeddedDatabaseType.HSQL);
		ds = builder.build();	
		return ds;
	}
	
	/**
	 * <bean id="mysql-ds" 
	 * 	class="org.springframework.jdbc.datasource.DriverManagerDataSource">
	 * 	<constructor-arg value="jdbc:mysql://localhost:3306/data1"/>
	 *  <constructor-arg value="root"/>
	 *  <constructor-arg value="password"/>
	 * </bean>
	 */
//	@Bean(name="mysql-ds")
//	public DataSource myDataSource(){
//		DataSource ds = new DriverManagerDataSource
//					(dbUrl,dbUser,dbPassword);
//		return ds;
//	}
	
//	@Bean(name="ora-ds")
//	public DataSource oraDatasource(){
//		DataSource ds = new DriverManagerDataSource
//					("jdbc:oracle:thin:@localhost:1521/xe","scott","tiger");
//		return ds;
//	}
//	
	
	@Bean(name="b2")
	public CustomerManager man(){
		return new CustomerManager(dao());
	}
	
}
