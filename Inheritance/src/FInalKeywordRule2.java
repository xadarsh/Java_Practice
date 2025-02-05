/*
 * final keyword Rule 2->
 * If a class is final class then it doesn't participate in inheritance.
 * It means if a class is declared with final keyword then we can not inherit it.
 */

//Example->
final class Vehicle1
{
	void disp() {
		System.out.println("Vehicle");
	}
}
//class Car1 extends Vehicle1		// Here we will get an error coz, we can not inherit final class
//{
//	
//}
public class FInalKeywordRule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
