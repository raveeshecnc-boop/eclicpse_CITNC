package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person7
{
	String name;
	int age;
	
	public Person7(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	 void display()
	 {
		 System.out.println("Name :"+ name + " , Age :"+ age );
	 }

}

class NameComparator implements Comparator<Person7>
{

	@Override
	public int compare(Person7 p1, Person7 p2) {
		
		return p1.name.compareTo(p2.name);
	}
	
}

class AgeComparator implements Comparator<Person7>
{

	@Override
	public int compare(Person7 p1, Person7 p2) {
		
		return Integer.compare(p1.age,p2.age);
	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
	
      List<Person7> people =new ArrayList<>();
      people.add(new Person7("Sushma",34));
      people.add(new Person7("Akash",25));
      people.add(new Person7("Hema",17));
      
      Collections.sort(people , new  NameComparator());
      System.out.println("Sorted by name");
      System.out.println();
      
      for(Person7 person:people)
      {
    	  person.display();
      }
      
      System.out.println();
      
      Collections.sort(people , new  AgeComparator());
      System.out.println("Sorted by age");
      System.out.println();
      
      for(Person7 person:people)
      {
    	  person.display();
      }
      
	}

}