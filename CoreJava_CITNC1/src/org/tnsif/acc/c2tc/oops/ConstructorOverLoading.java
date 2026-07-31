package org.tnsif.acc.c2tc.oops;

class Student2
{
	String name;
	int age;
	
	Student2()
	{
		System.out.println("Default constructor");
	}
	Student2(String name)
	{
		this.name=name;
		System.out.println("Name "+name);
	}
	Student2(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+ name +   "Age "+age);	 
	}	
}
public class ConstructorOverLoading {

	public static void main(String[] args) {
		Student2  s =new Student2();
		Student2  s1 =new Student2("Raveesh");
		Student2  s2 =new Student2("Raveesh",    21);

	}

}