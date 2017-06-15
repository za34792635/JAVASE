package com.qyspeed.test;

import java.util.Scanner;

public class TestGrade {

	public void Grade(double score)
	{
		System.out.println("please enter your score:"+score);
		
	    //Scanner sc =new Scanner(System.in);
		//score=sc.nextDouble();
		
		if(score<0||score>100)
		{
			System.out.println("please enter a correct score%");
			System.exit(0);
		}else if(score>=90){System.out.println("your grade is A");	}
		else if(score>=80){System.out.println("your grade is B");
		}else if(score>=70){System.out.println("your grade is C");
	}else if(score>=60){System.out.println("your grade is D");
}else {System.out.println("your grade is A");
}}
}