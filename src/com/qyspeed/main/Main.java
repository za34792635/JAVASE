package com.qyspeed.main;
import com.qyspeed.test.TestRunnian;
import com.qyspeed.test.TestGrade;
public class Main {

	public static void main(String[] args)
	{
		TestRunnian r=new TestRunnian();
		r.runnian();
		
		TestGrade point=new TestGrade();
		point.Grade(90.6);
	}
}
