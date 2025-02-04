
class Parentt
{
	int a,b;
	Parentt()
	{
		a=10;
		b=20;
		System.out.println("Parent class constructor executed!");
	}
	Parentt(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parent class constructor executed!");
	}
}


class Childd extends Parentt
{
	int x,y;
	
	Childd()
	{
		x=100;
		y=200;
		System.out.println("Child class constructor executed!");
	}
	Childd(int x,int y)
	{
		//in this case also JVM call only super() but if you want to execute the para const.
		//of parent call then we have to pass some argu. to the super(argu1,argu2) to call the
		//para const. and we have to call it explicitly
		super(x,y);
		this.x=x;
		this.y=y;
		System.out.println("Child class constructor executed!");
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}


public class ConstructorTwist2 {

	public static void main(String[] args) {
		
		
		Childd c=new Childd();
		c.disp();
		Childd c2=new Childd(1000,2000);
		c2.disp();
		

	}

}
