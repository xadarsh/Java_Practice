/*Topic-->interface naming conflicts:-
 * 
 * Case (i)-->	if two interface contain a method with same signature and return type,
 * 				in implementation class only one method implementation is enough.
 */
interface A
{
	void m1();
}
interface B
{
	void m1();
}
class C implements A,B
{
	public void m1()
	{
		System.out.println("m1() is executing but don't know from which interface");
	}
}

/*
 * Case (ii)-->	if two interfaces contain a method with same name & return type but different arguments, in the 
 * 				implementation class we have to provide implementation for both methods and the acts as a Overload method.
 */
interface D
{
	void m1();
}
interface E
{
	void m1(int i);
}
class F implements D,E
{
	@Override
	public void m1()
	{
		System.out.println("m1() is executing...");
	}
	@Override
	public void m1(int i)
	{
		System.out.println(i);
	}
	//both m1() methods will act as a method overloading
}

/*
 * Case (iii)[illegal case]--->	if two interfaces contain a method with same signature
 * 					different return types then it is not possible to implement
 * 					both interfaces simultaneously in a same class.
 */

interface A2
{
	void m1();
}
interface B2
{
	int m2();
}
/*
class C2 implements A2,B2	//this will give an error
{
	@Override
	public void m1() {}
	@Override
	public int m1() {}
}
*/
public class SixthCode_interfaceNamingConflicts {

}
