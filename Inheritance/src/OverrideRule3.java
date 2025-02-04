/* Overriding Rule 3->
 * Return type of overridden method in child class can be different as that of parent, if it is 
 * "Co-variant return type" ( Is-A relationship between the return type)
 */

//Example->

class Interest
{
	
}
class InterestPersonalLoan extends Interest
{
	
}
class Loan
{
	public Interest disp()
	{
		Interest it=new Interest();
		return it;
	}
}
class PersonalLoan extends Loan
{
	public InterestPersonalLoan disp()//here we will not get any error even the return type id different that confilt the Rule 2.
	{								  //But here there is a Is-A relation b/w both the return type ( InterestPersonalLoan extends the Interest) so this is allowed.
		InterestPersonalLoan ipl=new InterestPersonalLoan();
		return ipl;
	}
}
public class OverrideRule3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
