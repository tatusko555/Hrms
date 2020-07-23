package com.hrms.practice;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	//jdbc://driver type:hostname:port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void abc() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employees");
		rs.next();
		String firstname = rs.getString("emp_firstname");
		System.out.println(firstname);
		rs.next();
		String firstname2 = rs.getObject("emp_firstname").toString();
		System.out.println(firstname2);
		String allData;
		while(rs.next()) {
			allData = rs.getObject("emp_firstname").toString();
			System.out.println(allData);
			
		}
		rs.close();
		st.close();
		conn.close();
		
	}
	
	// retrieve all the job titles and store them in array list and 
	// show it in console
	@Test
	public void jobTitle() throws SQLException {
	Connection connect = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	Statement stat = connect.createStatement();
	ResultSet res = stat.executeQuery("select * from ohrm_job_title");
	
	List<String> arrayD = new ArrayList<String>();
	while(res.next()) {
		arrayD.add(res.getObject("job_title").toString());
	}
	System.out.println(arrayD);
	
	for (String data : arrayD) {
		System.out.println(data);
	}
		res.close();
		stat.close();
		connect.close();
	}
}
