//run it into terminal 

class Student
{
	static
	{
		System.out.println("Student class static block");
	}
	Student()
	{
		System.out.println("Student class constructor");
	}
}
public class First {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
        Object o=Class.forName(args[0]).newInstance();
        System.out.println(o.getClass().getName());
    }

}
