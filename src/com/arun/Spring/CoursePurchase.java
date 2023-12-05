package com.arun.Spring;

public class CoursePurchase 
{
	
	private Course course;
	
	public CoursePurchase(Course course)
	{
		this.course=course;  
	}
	
	public void setCourse(Course course)
	{
		this.course=course;
	}
	
	public boolean buyCourse(int amount)
	{
		
		boolean status=course.coursePurchase();
//		Javacourse jc=new Javacourse();
//		jc.coursePurchase();
		return status;
		
	}
}
