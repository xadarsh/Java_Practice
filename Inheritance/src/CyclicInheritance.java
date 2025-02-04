//Cyclic inheritance is not allowed
//understand by below example

class Person1 extends Person2
{
	
}
                                         //Here a cycle is formed and this is not allowed
class Person2 extends Person1
{
	
}

public class CyclicInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
