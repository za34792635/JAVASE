package com.qyspeed.main;
import com.qyspeed.test.TestRunnian;

import java.sql.Date;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qyspeed.domain.Admin;
import com.qyspeed.test.JDBCTest;
import com.qyspeed.test.TestGrade;
public class Main {

	public static void main(String[] args) throws SQLException
	{/*
		TestRunnian r=new TestRunnian();
		r.runnian();
		
		TestGrade point=new TestGrade();
		point.Grade(90.6);
		*/
	
	 JDBCTest jdbctest= new JDBCTest();
	 jdbctest.JDBCStart();
	}

}