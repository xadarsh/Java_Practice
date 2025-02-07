//In this code we will see how we can create anonymous class for a abstract class
//Normally we can create an object of an Abstract class
//to use a abstract class we need to inherit it and then use it

abstract class Computer
{
	abstract public void show();
}
//Suppose this Laptop class will be in use only one time in a complete code
class Laptop extends Computer
{
	public void show()
	{
		System.out.println("This is a Laptop");
	}
}
public class FifthCode_Anonymous_Class_With_Abstract_Class {

	public static void main(String[] args) {
		//Computer obj=new Computer();	//this will give error coz we can not create object of an abstract class
		Laptop obj=new Laptop();
		obj.show(); //we can use like this and also
		Computer obj2=new Laptop();
		obj2.show();// use like this
		//but here we will see if the class is in use only one time then how to override the method of an abstract class
		
		Computer obj3=new Computer()	//The anonymous class extends the computer class behind the screen
				{
					public void show()
					{
						System.out.println("Anonymous inner class\nThis is a Laptop");
					}
				};
				
				obj3.show();
	}

}
