/*
 * It stands for variable argument methods. 
 * In java language, if we have variable number of arguments, then copulsorily new method has to be written till jdk 1.4v
 * But jdk 1.5v we can write single method which can handle variable number of arguments
 * but all of them should be of same type.
 * 
 * Internally var-arg method will convert to SingleDimension array so  we can
 * access the var arg method arguments using index
 * 
 * Syntax:- methodName(dataType... variableName)
 */

//Example:-

class Sum
{
	public void add(int... x)
	{
		int total=0;
		for(int i=0;i<x.length;i++)
		{
			total+=x[i];
		}
		System.out.println("Sum is: "+total);
	}
}
public class First {

	public static void main(String[] args) {
		
		Sum s=new Sum();
		s.add();
		s.add(10);
		s.add(10,20);
		s.add(10,20,30);
	}

}
