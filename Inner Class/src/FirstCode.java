/*
 * Inner class- A class inside another class is known as inner class.
 * - We can create the object of inner class in the outer class too.
 */
class A1
{
	B1 obj=new B1();//we can create the object of inner class here too.
	//obj.show2();//but we can not call the methods of inner class here coz a method can be call inside another method only (like main() or any other).
	//	calling a function is an action
	//	action can be taken only in method
	public void show()
	{
		System.out.println("Outer class A");
		obj.show2();// we can call here
	}
	class B1
	{
		public void show2()
		{
			System.out.println("Inner class B");
		}
	}
}
public class FirstCode {

	public static void main(String[] args) {
		A1 obj=new A1();
		obj.show();
	}

}
