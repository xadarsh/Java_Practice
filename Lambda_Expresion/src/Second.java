/*
 * Magics of lambda expression:
 * 
 * i) writing dataType of parameters is not required.
 * ii) if there is only one parameter then parentheses is also not required.
 * iii) if there is only one line of body or statement then we can remove the curly brackets also.
 * iv) if the body is of one line and there is a requirement of return something
 * 		then there is no need to write the return statement, we can directly write the login of one line
 * 		implementation and that will return the result automatically.
 * 		But if you write the return statement in the single line of body then
 * 		curly bracket is mendatory otherwise it'll give an error.
 */
//Example of (i):
@FunctionalInterface
interface Addition
{
	void add(int a,int b);
}
//Example of (ii):
@FunctionalInterface
interface Square
{
	void sq(int num);
}
//Example of (iii):
@FunctionalInterface
interface Sub
{
	void sub(int n1,int n2);
}
//Example of (iv):
@FunctionalInterface
interface Multiplication
{
	int multi(int n1,int n2);
}

//var-arg example using lambda expression
@FunctionalInterface
interface Multiadd
{
	void multiadd(int... x);
}
public class Second {

	public static void main(String[] args) {
		//example (i)
		Addition add=(a,b)->{
			System.out.println("Sum:"+(a+b));
		};
		add.add(10, 20);
		
		//example (ii)
		Square square= num->
		{
			System.out.println("Square of the given number is:"+(num*num));
		};
		square.sq(2);
		
		//example (iii)
		Sub sub=(n1,n2)-> System.out.println("Sub:"+(n1-n2));
		sub.sub(5, 2);
		
		//example (iv)
		Multiplication mul=(n1,n2)-> n1*n2; //mul=(n1,n2)-> return n1*n2 (this will give error)
											//to use return statemnent in single line we have to use { }; ==> mul=(n1,n2)->{return n1*n2;};
		System.out.println("Multiplication:"+mul.multi(2,5));
		
		//var-arg example using lambda expression
		Multiadd ma=x->
		{
			int sum=0;
			for(int i:x)
				sum+=i;
			System.out.println("Total sum:"+sum);
		};
		
		ma.multiadd(10,20,30,40,50);
	}

}
