/*
 * Polymorphism means [1:Many] it means on variable can use for multiple objects
 * and that one variable is parent type variable of that object.
 */
//Example->
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
class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("Fighter plane flies at high altitude.");
	}
}

class Airport
{
	public void permit(Plane plane)//Here we store all child object reference in parent type reference variable
	{								// and here [1:Many] works coz plane is used for all child reference otherwise we have to create different different
		plane.takeoff();			//method for every child type variable to hold the reference
		plane.fly();				//and also this is know as Loose coupling
		plane.landing();
	}
}

public class PlaneExample {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();			//Tight coupling
		PassengerPlane pp=new PassengerPlane();	//Tight coupling
		FighterPlane fp=new FighterPlane();		//Tight coupling
		Airport a=new Airport();				//Tight coupling
		
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
	}

}
