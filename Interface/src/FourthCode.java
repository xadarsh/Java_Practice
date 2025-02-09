//Difference between extends & implements:-
/*
 * (i) one class can extends only one class at a time
 * 		however a class can implement more than one interface at a time.
 * 
 * Note:- one class can extends only one class at a time but one interface can extends multiple interfaces at a time.
 */

interface X
{
	void m1();
}
interface Y
{
	void m2();
}
class Test implements X,Y
{
	public void m1() {}
	public void m2() {}
}


/*
 * (ii) A class can extends a class and can implements any number of
 * 		interfaces simultaneously.
 * 		But you must follow a sequence of writing-
 * 		
 * 		(a) extends    then (b) implements
 */
	
interface XX
{
	void m1();
}
interface YY
{
	void m2();
}
class XY
{
	void m3()
	{
		System.out.println("m3 of class XY...");
	}
}
class XXY extends XY implements XX,YY
{
	public void m1() {}
	public void m2() {}
}

/*
 * (iii) Legal relation between classes and interfaces-
 * 
 * 		(a) class & class--> extends	(eg: class X extends class Y)
 * 		(b) class & interface--> implements	(eg: class X implements interface Y)
 * 		(c) class & class & interface--> extends implements (eg: class X extends Y implements Z)
 * 		(d) interface & interface--> extends (eg: interface X extends interface Y or interface X extends interfaces Y,Z,A)
 * 	
 * 		only these 4 relations are legal any others are illegal
 */
public class FourthCode {

}
