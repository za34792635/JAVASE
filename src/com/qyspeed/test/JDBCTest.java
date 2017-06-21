package com.qyspeed.test;
import java.sql.*;
/*
 * JDBC编程
 */
public class JDBCTest {
    public Connection conn;
	public Statement stmt;
	static final String DBURL="jdbc:mysql://120.16.145.98/dengjiajun";
	static final String USER="root";
    static final String PASSWORD="jiajun";
	public void JDBCStart() throws SQLException
	{
	try {
		
		//注册加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//打开链接，请求连接数据库
	    System.out.println("正在连接数据库...");
	     conn=DriverManager.getConnection(DBURL,USER,PASSWORD);
	    
	    //执行查询
	    System.out.println("实例化Statement执行sql语句");
	     stmt=conn.createStatement();
	    String sql;
	    sql="select teacherNumber from teacher";
	    ResultSet rs=stmt.executeQuery(sql);
	    
	    //处理返回结果集
	    while(rs.next())
	    {
	    	String test1=rs.getString("teacherNumber");
	    	System.out.println("老师id"+test1);
	    	
	    }
	    //结束关闭JDBC连接
	    rs.close();
	    stmt.close();
	    conn.close();
	    
	} catch (SQLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}catch (Exception e)
	{
		e.printStackTrace();
	}finally
	{
		try
		{
			if(stmt!=null) {stmt.close();}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(conn!=null){conn.close();}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("goodbye");
	}
	}
	
}
