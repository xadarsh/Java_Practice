//There are 4 rules that we must follow to override a method

/*Overriding Rule.1-> 
 * We can not reduce the visibility of overridden method but we can increase the visibility of overridden method
*/

//Example 1->
class Demo1
{
	public void disp()
	{
		System.out.println("Parent");
	}
}
class Demo2 extends Demo1
{
//	void disp() //Here we get the error because by default the access modifier is default
//	{			// and we know that the visibility of default is less then public hence we got the error coz this is not allowed
//		System.out.println("Child");
//	}
}

//Example 2->
class Demoo1
{
	void disp()
	{
		System.out.println("Parent");
	}
}
class Demoo2 extends Demoo1
{
	public void disp() // here we will not get any error because the parent class disp() access modifier is default
	{					// and this overridden method access modifier is public it means here we increase the visibility and this is allowed
		System.out.println("Child");
	}
}
public class OverrideRule1 {

	public static void main(String[] args) {
		
	}

}
