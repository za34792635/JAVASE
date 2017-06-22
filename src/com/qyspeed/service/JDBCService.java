package com.qyspeed.service;
import java.sql.*;
/*
 * Class.forname()
 * DriverManage
 * Statement/PreparedStatement
 * Result
 * executeQuery/executeUpdate
 */
public class JDBCService {
    public Connection conn;
	public Statement stmt;
	static final String DBURL="jdbc:mysql://120.76.145.98:3306/dengjiajun";
	static final String USER="root";
    static final String PASSWORD="jiajun";
	public void JDBCStart() throws SQLException
	{
	try {
		
		//注册加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//打开链接，请求连接数据库
	    System.out.println("正在连接数据库...");
	    conn=DriverManager.getConnection(DBURL,USER,PASSWORD);//Connection对象 =驱动管理.获取连接(地址,用户,密码)
	    
	    //创建Statement 对象来执行 sql语句
	    //executeQuery()-查询
	    //executeUpdate()-增（insert），删(delete)，改(update)
	    System.out.println("实例化Statement执行sql语句");
	    stmt=conn.createStatement();
	    String sql;
	    sql="select username from admin";
	    ResultSet rs=stmt.executeQuery(sql);//接受 查询结果的返回集
	    //处理返回结果集
	    while(rs.next())
	    {
	    	String test1=rs.getString("username");
	    	System.out.println("用户名："+test1);
	    	
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
