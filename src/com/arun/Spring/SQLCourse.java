package com.arun.Spring;

public class SQLCourse implements Course 
{
	public boolean coursePurchase()
	{
		System.out.println("SQL Course is Purchased");
		return true;
	}
}
