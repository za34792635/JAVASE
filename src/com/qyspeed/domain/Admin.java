package com.qyspeed.domain;

/*
 * 创建 Admin 表的持久对象类
 */
public class Admin {

	//管理员用户名
	private String username;
	//管理员密码
	private String password ;
	
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username=username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
}
