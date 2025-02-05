/*
 * final keyword Rule 3->
 * final method can get inherited but we can not override it.
 * We have to use it as it is declared in it's parent class.
 */
//Example->
class Vehicle2
{
	final void disp()
	{
		System.out.println("Vehicle");
	}
}
class Car2 extends Vehicle2
{
//	void disp()		//we will get an error here coz, we can inherit a final method but we can not override it.
//	{
//		System.out.println("Car");
//	}
}
public class FinalKeywordRule3 {

	public static void main(String[] args) {
		
		Car2 car=new Car2();
		car.disp();		//Output-> Vehicle

	}

}
