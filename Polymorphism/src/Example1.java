class Parent1
{
	void laugh()
	{
		System.out.println("Parent is laughing....");
	}
}
class Child1 extends Parent1
{
	void laugh() {
		System.out.println("Child1 is laughing at low voice....");
	}
}
class Child2 extends Parent1
{
	void laugh()
	{
		System.out.println("Child2 is laughing at high voice...");
	}
}
public class Example1 {

	public static void main(String[] args) {
		
		Child1 ch1=new Child1();//This is called as Tight Coupling.
		Child2 ch2=new Child2();//This is called as Tight Coupling.
		ch1.laugh();//Child1 is laughing at low voice...
		ch2.laugh();//Child2 is laughing at high voice...
		
		Parent1 ref=ch1;//This is called as Loose Coupling and we can achieve polymorphism.
		// or we can write is as
		//Parent ref=new Child1();
		ref.laugh();
		ref=ch2;	//Loose Coupling.
		ref.laugh();
		
		
	}

}
