package com.arun.Spring;

public class LaunchMain {

	public static void main(String[] args) 
	{
		
		
		
		CoursePurchase cp=new CoursePurchase(new Javacourse());
		
		cp.buyCourse(100);
		
		cp.setCourse(new PythonCourse());
		
		cp.buyCourse(1000);
		

	}

}
