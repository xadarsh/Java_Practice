/* Overriding Rule 4->
 * Parameters of overridden method must be same as that of parent class else it will be considered as specialized method
 * and this will be considering as method overloading concept
 */

//Example->
class Demmo1
{
	int a=10;
	int b=20;
	public int add(int a,int b)
	{
		return a+b;
	}
}
class Demmo2 extends Demmo1
{
	int a=100;
	public int add(int a)// Here the overridden method parameter is different as that of its parent so this will consider as specialized method
	{					// and it'll work as method overloading
		return a;
	}
}
public class OverrideRule4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



//These are the 4 Rules that we must follow to override a method
