import java.util.Scanner;
abstract class Shapes
{
	float area;
	Scanner sc=new Scanner(System.in);
	abstract public void input();
	abstract public void compute();
			 public void disp()
			 {
				 System.out.println("Area is: "+area);
			 }
}
class Rectangle extends Shapes
{
	float length,width;
	public void input()
	{
		System.out.println("Enter the length of the Rectangle: ");
		length=sc.nextFloat();
		System.out.println("Enter the width of the Rectangle: ");
		width=sc.nextFloat();
		//compute();
	}
	public void compute()
	{
		area=length*width;
		//disp();
	}
}
class Square extends Shapes
{
	float side;
	public void input()
	{
		System.out.println("Enter the side of the Square: ");
		side=sc.nextFloat();
		//compute();
	}
	public void compute()
	{
		area=side*side;
		//disp();
	}
}
class Circle extends Shapes
{
	final float pi=3.14f;
		  float radius;
	public void input()
	{
		System.out.println("Enter the radius of the Circle: ");
		radius=sc.nextFloat();
		//compute();
	}
	public void compute()
	{
		area=pi*radius*radius;
		//disp();
	}
}
class Calculation
{
	public void calculate(Shapes s)
	{
		s.input();
		s.compute();
		s.disp();
	}
}



public class AreaComputation {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();
		Square sq=new Square();
		Circle c=new Circle();
		Calculation cal=new Calculation();
		
		cal.calculate(r);
		cal.calculate(sq);
		cal.calculate(c);
		
		System.out.println("Done....");

	}

}
