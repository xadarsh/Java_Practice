/*Overriding Rule 2->
 * Return type of overridden method must be same as that of overrdidng method in parent class
*/			

//Example->
/*class Demo1
{
	public int add()
	{
		return 10+2;
	}
}
class Demo2 extends Demo1
{
	public void add()//Here we will get an error coz the return type of overridden method must be  
	{				 // same as that of parent class and in parent class the return type is int so here also the return type must be int
		System.out.println("overridden method");
	}
}
*/
public class OverrideRule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
