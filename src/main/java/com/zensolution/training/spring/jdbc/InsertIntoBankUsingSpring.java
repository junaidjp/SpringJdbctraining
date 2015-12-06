package com.zensolution.training.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsertIntoBankUsingSpring {
	
	public static void main(String args[]) throws SQLException { 
		
		ApplicationContext daoContext =
				new ClassPathXmlApplicationContext("application-context.xml");
		
		 DataSource dataSource = (DataSource) daoContext.getBean("datasource");
		
		 Connection connection = dataSource.getConnection();
		 
		 
		 
		 
		 
		 
		 PreparedStatement insertstatement  = null;
			String insertSql = "insert into bank  (bankid,bankname, banktype,locatiomn,empid) values  ( ? , ? , ? ,?,?)";
			 insertstatement = connection.prepareStatement(insertSql);
			 insertstatement.setInt(1,  2);
			 insertstatement.setString(2,"Bank Of Danish Home Loans");
			 insertstatement.setString(3, "public");
			 insertstatement.setString(4, "Texas");
			 insertstatement.setInt(5, 1);
			  // Once you have set tje values execute the query 
			insertstatement.executeUpdate();
		  insertstatement.close();
		  
		  System.out.println("Done inserting into the Database");
		
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
