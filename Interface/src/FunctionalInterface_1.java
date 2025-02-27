/*
 * Functional interface: An interface having only one abstract method is called
 * 						 as functional interface. @FunctionalInterface annotation 
 * 						 is used to tell the compiler and programmer that it is
 * 						 a functional interface.
 */
//Example:

@FunctionalInterface
interface Demo
{
	void disp(String name);
}
class Testfun implements Demo
{
	public void disp(String name)
	{
		System.out.println("Hello "+name);
	}
}
public class FunctionalInterface_1 {

	public static void main(String[] args) {

		Testfun t=new Testfun();
		t.disp("Adarsh");
	}

}
