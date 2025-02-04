/*
 	Override means when we inherit a method from a parent and we apply some modification in the 
 	behaviour of the method then this is known as overridden method
 	
 	1) if method is inherited without any changes from parent class to child class then it is k/a inherit method
 	2) if method behaviour is changed by the child class then this method is k/a overridden method
 	3) if method is initialized or created in the child class and parent doesn't have that method then this
 		type of method is known as Specialized Method
 		
 	Understand by the below example
 	
 */

class Plane
{
	public void takeoff()
	{
		System.out.println("Plane is takking off.");
	}
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void landing()
	{
		System.out.println("Plane is landing");
	}
}


class CargoPlane extends Plane
{
	public void fly()
	{
		System.out.println("Cargo plane is Flying");
	}
	public void carryGoods()
	{
		System.out.println("Cargo planes carrier goods.");
	}
}


class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("Passenger plane is flying.");
	}
	public void carryPassenger()
	{
		System.out.println("Passenger Plane carries passenger.");
	}
}
public class OverrideExp {

	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
		cp.takeoff();	// inherit method
		cp.fly();		// overridden method
		cp.carryGoods();// specialized method
		cp.landing();	//inherit method
		
		System.out.println();
		
		pp.takeoff();	// inherit method
		pp.fly();		// overridden method
		pp.carryPassenger();// specialized method
		pp.landing();	// inherit method

	}

}
