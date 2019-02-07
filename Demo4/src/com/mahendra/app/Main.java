package com.mahendra.app;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args)throws SQLException {
	ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
	DataSource ds= context.getBean(DataSource.class);
	Connection con = ds.getConnection();
	System.out.println("Data Source: "+con.getMetaData().getDatabaseProductName());
	}

}
