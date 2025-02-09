/*
 * To identify which class is interface and which class is normal class we have to follow a rule-
 * Rule-> use "I" as prefix in the class name
 * example- Demo(normal class) ----> IDemo(interface)
 * 			Student(normal class)---> IStudent(interface)
 * that is a convention that developer follows
 * 
 * 
 * In springBoot developer follows this convention so we have to learn it and follow same as it.
 * 
 **To inherit an interface class we have to use "implements" keyword 
 *
 **Also to the class which will extend the interface that also have to follow a name convention rule that is:
 *			---> we have to use "Impl" as suffix in the class name.
 *				eg:- suppose I have to implement a interface class name ISample then my class name will be 
 *					
 *				class "SampleImpl" implements ISample
 *				{
 *					
 *				} 
 *
 */




interface ISample
{
	//100% abstraction
	//services
	/*public abstract*/ void m1();
	/*public abstract*/ void m2();
}
class SampleImpl implements ISample
{
	public void m1()	//in interface class the access modifier is by default "public" and in normal class it is "default"
	{					//visibility is decreasing hence we have to explicitly make it "public"
		System.out.println("m1() is calling...");
	}
	public void m2()
	{
		System.out.println("m2() is calling...");
	}
}
public class SecondCode {

	public static void main(String[] args) {
		
		ISample s=new SampleImpl();	//loose coupling
		s.m1();
		s.m2();

	}

}
