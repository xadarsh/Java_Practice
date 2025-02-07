// Process to create the object of non-static inner class

class A3
{
	//B obj=new B();//we can create the object of inner class here too.
	
	public void show()
	{
		System.out.println("Outer class A");
		//obj.show2();// we can call here
	}
	 class B3
	{
		public void show2()
		{
			System.out.println("Inner class B");
		}
	}
}
public class ThirdClass {

	public static void main(String[] args) {
		A3 obj1=new A3();
		obj1.show();
		//class B3 is inside class A3 that why we need the class A3 to create the object of B2 
		//as we know know that to access a non static member of a class we need the reference variable of the object of that class so
		//here the reference of class A2 is obj1 so it will get in use of create the object of inner class
		A3.B3 obj2=obj1.new B3();
		obj2.show2();
		//this objection creation method is application only when the inner class is non-static
	}

}
