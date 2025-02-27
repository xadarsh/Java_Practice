
//"->" called arrow operator or lambda operator
// lambda function is working only with the functional interface
@FunctionalInterface
interface Add
{
	void add(int a,int b);
}
public class First {

	public static void main(String[] args) {

		Add a=(int x,int y) ->{	//we can remove the dataType of the parameter like: =(a,b)->{};
			System.out.println("Sum:"+(x+y));	//if only one line statement is there then
		};										//we can remove the curly brackets
		
		//Add a=(int x,int y)->System.out.println("Sum:"+(x+y));
		
		a.add(10, 20);
	}
}
/*
 * Every lambda expression has 2 parts:-
 * 	i) left side of "->" that is () which required the parameters
 * 	ii)right side of "->" {}; in which the body of the method is implemented
 */

/*
 * Note: i) it is not necessary to define the dataType of the parameter in the lambda exp.
 * 			coz it is already defined into the functional interface.
*/
