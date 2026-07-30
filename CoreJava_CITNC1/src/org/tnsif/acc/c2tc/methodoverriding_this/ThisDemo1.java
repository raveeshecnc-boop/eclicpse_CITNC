package org.tnsif.acc.c2tc.methodoverriding_this;

class Person
{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	void displayDetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
public class ThisDemo1 {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Hema");
		person.setAge(26);
		person.getName();
		person.getAge();
		person.displayDetails();
		person.setName("Tejas");
		person.setAge(24);
		person.getName();
		person.getAge();
		person.displayDetails();
		person.setName("ABCCC");
		person.setAge(32);
		person.getName();
		person.getAge();
		person.displayDetails();
		
		

	}

}