//Making the inner class as static and accessing it's method
//We can only make inner class as static(We can't make outer class as static it will give error).
class A2
{
	B2 obj=new B2();//we can create the object of inner class here too.
	
	public void show()
	{
		System.out.println("Outer class A");
		//obj.show2();// we can call here
	}
	static class B2
	{
		public void show2()
		{
			System.out.println("Inner class B");
		}
	}
}
public class SecondCode {

	public static void main(String[] args) {
		//creating object of outer class
		A2 obj=new A2();
		obj.show();
		A2.B2 obj2=new A2.B2();// this object creation method is valid only when the 
							// inner class is static else it'll give error 
							//one next code ThirdCode.java you'll get to know how to create object of inner 
							//class which is non-static
		obj2.show2();
		
		/*
		 We can not create of a inner class like other outer class
		 B obj2=new B(); //This will give error
		 */
	}

}
