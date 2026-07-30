package org.tnsif.acc.c2tc.methodoverriding;

class Notification
{
	String mesage = "Default Nootification";
	
}
class PushNotification extends Notification 
{
	String message ="Push Notification";
	
	void ShowNotification ()
	{
		System.out.println("child message :"+message);
		System.out.println("Parent message:"+super.mesage);
	}
}

public class SuperWithVariable {

	public static void main(String[] args) {
		
		PushNotification obj = new PushNotification();
		obj.ShowNotification();
		// TODO Auto-generated method stub

	}

}