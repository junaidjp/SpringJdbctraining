package com.zensolution.training.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.bank.entity.Account;
import com.bank.entity.Customer;

public class InsertIntoBank {
	
	
	public static void main(String args[]) throws SQLException, ClassNotFoundException { 
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofdanish", "root",
				"junaid123");
		System.out.println("Successfully establised a Ping");
		PreparedStatement insertstatement  = null;
			String insertSql = "insert into bank  (bankid,bankname, banktype,locatiomn,empid) values  ( ? , ? , ? ,?,?)";
			 insertstatement = conn.prepareStatement(insertSql);
			 insertstatement.setInt(1,  2);
			 insertstatement.setString(2,"Bank Of Danish Home Loans");
			 insertstatement.setString(3, "public");
			 insertstatement.setString(4, "Texas");
			 insertstatement.setInt(5, 1);
			  // Once you have set tje values execute the query 
			insertstatement.executeUpdate();
		  insertstatement.close();
			 
			}
		
		
		
		 
		 
		 
		
		 }

	

