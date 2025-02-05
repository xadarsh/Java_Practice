/*
 * Direct using parent type reference you can not call specialized method.
 * To overcome this problem we use "Downcasting".
 * Downcasting means typecaste the parent type reference to a child type of access the specialized method.
 */
//Example->
class Parent2
{
	void work()
	{
		System.out.println("Parents are working hard.");
	}
}
class Child22 extends Parent2
{
	void work()
	{
		System.out.println("Child didn't work hard.");
	}
	void play()
	{
		System.out.println("Child is playing all the day.");
	}
}
public class Downcasting {

	public static void main(String[] args) {
			
		Parent2 p=new Child22();
		p.work();// output-> Child didn't work hard.
		//p.play();// it will give error coz you are tring to accesss a specialized method using parent type reference and this is not possible
				 // for this we have to downcaste the parent type reference.
		((Child22)p).play();// here we downcaste the parent type reference to child type to access the specialized method 
						   //output-> Child is playing all the day.
	}
	
	
	
	// One more thing is-> Loose coupling is also known as Upcasting

}
