package org.tnsif.acc.c2tc.datatype_typecasting;

public class FoodOrder {

	public static void main(String[] args) {
		// Primitive data type
		
		int orderId =101;
		double price =299.99;
		boolean isDelivered= false;
		char rating='A';
		float delivearyDistance=5.3f;
		long delivaryBoyPhone=9835365252L;
		byte delivaryTime=45;
		short restaruntId=12;
		
		//Non Primitive data type
		
		String CustmerName="Anjali";
		String[]foodItem= {"Burger","Fries","COke"};
		
		System.out.println("Order Summary");
		System.out.println("CustmerName:"+CustmerName);
		System.out.println("OrderId:"+orderId);
		System.out.println("RestaruntId:"+restaruntId);
		System.out.println("Delivary Boy Number:"+delivaryBoyPhone);
		System.out.println("FoodItem:");
		for (String item : foodItem) {
			System.out.println("-"+ item);
		}
		System.out.println("Total Price:"+price);
		System.out.println("DelivearyDistance:"+delivearyDistance);
		System.out.println("Expected Time:"+delivaryTime);
		System.out.println("Delivary Status:"+isDelivered);
		System.out.println("Rating:"+rating);
	}

}
