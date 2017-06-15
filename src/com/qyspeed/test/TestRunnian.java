package com.qyspeed.test;
import java.util.Scanner;
public class TestRunnian {

	public boolean runnian()
	{
		boolean runnian = false;
		int year;
		System.out.println("please enter the year:");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(0>year||year>3000)
		{
			System.out.println("please enter correct year !");
			System.exit(0);
		}else if((year%4==0)&&(year%100!=0)||year%400==0)
		{
			runnian=true;
			System.out.println(runnian+","+year+" is runnian");
			
		}else{
			
			System.out.println(runnian+","+year+" is not runnian");
			
		}
		return runnian;
		
		
		
	}
}
