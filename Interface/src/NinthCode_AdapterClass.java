/*Topic-> Adapter Class:-
 * 
 * (i)	It is a simple java class that implements an interface only with empty
 * 		implementation (body) for every method.
 * 
 * (ii)	If we implement an interface the copulsorily we should give the body for
 * 		all the methods whether it is required or not.
 * 
 * (iii)It is design pattern allowed to solve the problem of direct implementation of interface.
 * 
 * eg-
 */
interface X4
{
	void m11();
	void m22();
	void m33();
	void m44();
}

class Test2 implements X4
{
	//in this class we need only m3() but as we implement we need to implementation of all methods
	public void m33()
	{
		System.out.println("m3() is executing....");
	}
	//rest of the we will give as empty implementation
	//This approach increases the length of the code and reduces readability
	public void m11() {}
	public void m22() {}
	public void m44() {}
}

//Solution:
abstract class AdapterX4 implements X4
{
	public void m11() {}
	public void m22() {}
	public void m33() {}
	public void m44() {}
}
class Test3 extends AdapterX4
{
	public void m33()
	{
		System.out.println("m3() is need only...");
	}
}
public class NinthCode_AdapterClass {

	public static void main(String[] args) {
		
		X4 ref=new Test3();	//loose coupling and this is a good approach
		ref.m33();

	}

}
