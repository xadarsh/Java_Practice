/*There are three definition of an interface-
 * Def 1-any Service Requirement Specification (SRS) is called interface.
 * Def 2-interface acts a contract between client and service provide.(eg- Customer->GUI<-Bank)
 * Def 3-inside interface every method is always abstract whether we are declaring or not,
 * 		 hence interface is considered as 100% pure abstract class. 
 */
//if a class is declared as interface then by default access modifier is public rather than default.
//if we declare a class as interface than we dont need to use class keyword

interface  IBank
{
	//100% abstraction
	//services
	/*public*/ void deposit();		//by default access modifier is "public" for interface class
	/*public*/ void checkBalance();	//by default every method of an interface is "abstract" so we not need to write it
	/*public*/ int withdraw();
}
public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * Summary:- interface corresponds to service requirement specification(SRS) or contract between client and service provider 
 * 			 or 100% pure abstraction or abstract class.
 */