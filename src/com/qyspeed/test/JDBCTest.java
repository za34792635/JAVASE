package com.qyspeed.test;
import java.sql.*;
/*
 * JDBC���
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
		
		//ע���������
		Class.forName("com.mysql.jdbc.Driver");
		//�����ӣ������������ݿ�
	    System.out.println("�����������ݿ�...");
	     conn=DriverManager.getConnection(DBURL,USER,PASSWORD);
	    
	    //ִ�в�ѯ
	    System.out.println("ʵ����Statementִ��sql���");
	     stmt=conn.createStatement();
	    String sql;
	    sql="select teacherNumber from teacher";
	    ResultSet rs=stmt.executeQuery(sql);
	    
	    //�����ؽ����
	    while(rs.next())
	    {
	    	String test1=rs.getString("teacherNumber");
	    	System.out.println("��ʦid"+test1);
	    	
	    }
	    //�����ر�JDBC����
	    rs.close();
	    stmt.close();
	    conn.close();
	    
	} catch (SQLException e) {
		// TODO �Զ����ɵ� catch ��
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
