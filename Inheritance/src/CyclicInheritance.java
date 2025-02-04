//Cyclic inheritance is not allowed
//understand by below example

class Person11 //extends Person22
{
	
}
                                         //Here a cycle is formed and this is not allowed
class Person22 extends Person11
{
	
}

public class CyclicInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
