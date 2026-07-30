package org.tnsif.acc.c2tc.methodoverriding;

class Payment1
{
	void process()
	{
		System.out.println("Processingggg ");
	}
}


class gpay extends Payment1
{
	void process()
	{
		System.out.println("google pay");
	}
	void CompleteTransaction()
	{
		super.process();
		process();
		
	}
}

public class SuperWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       gpay obj= new gpay();
	       obj.CompleteTransaction();

	}

}