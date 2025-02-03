/*the first static block runs which one is defined in the class in which main method is defined
In this example one static block is defined in the StaticExp class which holds the main method
so that static block will execute first then main method run and in main method the first SOP run
then object creation happen then Student11 class load and then the second static block will execute
no matter there is a static block in other class, the first static block execute which is 
defined in main class which holds the main method
Execution flow->

				1) static variable initialisation
				2) static block
				3) static method
				4) non-static variable initialisation
				5) java block
				6) constructor
				7) non-static method or normal method
*/
class Student11
{
     static {
        System.out.println("Static Block Student");
    }
    {
        System.out.println("Java Block");
    }
    Student11(){
        System.out.println("Constructor");
    }
}
class StaticExp {
	static {
        System.out.println("Static Block main class");
    }
   
    public static void main(String[] args) {
        System.out.println("Main method");
        Student11 s=new Student11();
    }
}