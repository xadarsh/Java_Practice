/*
 * If you don't want to implement a method of an interface in a implementation class then you have to follow this rule:-
 * 
 * i) as we know that by default the methods of an interface is "public abstract" then in the implemented class you have to
 * 		write the method with same access specifier and modifier (public and abstract) explicitly
 * 
 * ii) when you complete the point (i) then after that- as we know that, in a class if there is atleast one abstract method
 * 		then the class must be declare as abstract class so we have to follow this also.
 *  
 */
//Example
interface ISamplee
{
	//100% abstraction
	//services
	/*public abstract*/ void m1();
	/*public abstract*/ void m2();
}
//(b) if there is atleast one method abstract in a class then the class must be an abstract class, so we have to make it abstract class explicitly .
abstract class SampleeImpl implements ISamplee
{
	public void m1()	//in interface class the access modifier is by default "public" and in normal class it is "default"
	{					//visibility is decreasing hence we have to explicitly make it "public"
		System.out.println("m1() is calling...");
	}
	//(a) we have to make the method public abstract explicitly then see (b)
	public abstract void m2();
}
//After completing this much still you will get error and you can't create an object of SampleeImpl class
//So from here a new class should be there which will extends the implemented(the class which one implement interface) and override the remaining methods
//Here-->
class Sample3 extends SampleeImpl
{
	@Override 
	public void m2()
	{
		System.out.println("m2() method executing in Sample3 class...");
	}
}
public class ThirdCode {

	public static void main(String[] args) {
		
		//ISamplee s=new SampleeImpl();	  //now we can not create an object of SampleeImpl class
									 	  //we have to create the object of a class who extends the interface implemented class
		ISamplee s=new Sample3();
		s.m1();
		s.m2();
		
		SampleeImpl ss=new Sample3(); //Loose coupling //this will not give error
		//Both object creation method is loose coupling but this one is not a good approach we should ignore this one and use the first one.
		ss.m1();
		ss.m2();
	}

}
