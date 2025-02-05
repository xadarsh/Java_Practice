/*
 * final keyword Rule 4->
 * Variable declared with final keyword act as a constant we can not change it.
 */
//Example->
class ValueOfPi
{
	final float pi=3.14f;
	
	void disp()
	{
//		pi=3.5f		// here we will get an error coz, we can not change the value of final variable.
		System.out.println("Value of pi is:"+pi);
	}
}
public class FInalKeywordRule4 {

	public static void main(String[] args) {
		
		ValueOfPi vop=new ValueOfPi();
		vop.disp();
	}

}
