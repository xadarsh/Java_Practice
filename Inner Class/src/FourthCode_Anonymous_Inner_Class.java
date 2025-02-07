//Anonymous inner class is a class without name
//Example
class Phone
{
	public void show()
	{
		System.out.println("This is common phone");
	}
}
public class FourthCode_Anonymous_Inner_Class {

	public static void main(String[] args) {
		Phone obj=new Phone()
				{
					//This is a class and it is known as Anonymous inner class.
					//and it is used only once in a complete code
					public void show()
					{
						System.out.println("This is a smart phone");
					}
				};
				obj.show();//Anonymous inner class method will be execute here
	}

}
