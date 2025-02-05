/*
 * Abstraction:- It means hiding the actual implementation and showcasing only the features.
 * eg: ATM machine we access all the features of an ATM machine but we din't know the actual implementation.
 * It can be achieve using abstract keyword and interface.
 * In java we can have method without body however those methods must be decleare as abstract.
 * In a class if atleast one method is abstract method then must the class also be declare as abstract.
 * abstract can only be a class or method , not a variable.
 */
//Example:-

abstract class Parent1
{
	abstract public void gender();
	abstract public void color();
	public void body()
	{
		System.out.println("I have a body...");
	}
	//abstract class can have abstract and non abstract both types of methods.
}
class Child1 extends Parent1
{
	public void gender()
	{
		System.out.println("Male");
	}
	public void color()
	{
		System.out.println("Fair");
	}
}
class Child2 extends Parent1
{
	public void gender()
	{
		System.out.println("Female");
	}
	public void color()
	{
		System.out.println("Dark");
	}
}


public class AbstractionRuleAndMeaning {

	public static void main(String[] args) {
		
			Child1 ch1=new Child1();
			Child2 ch2=new Child2();
			ch1.body();
			ch1.gender();
			ch1.color();
			
			ch2.body();
			ch2.gender();
			ch2.color();
	}

}
