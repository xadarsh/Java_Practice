//Simple Intrest Loan

import java.util.Scanner;
class LoanAcc
{
	private float principal;
	private float time;
	private float si;
	private static float rate;//it is static because it is common for everyone


static {
		rate=6.8f;
	}
	LoanAcc(){
		setInputs();
	}
	void setInputs()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal amount");
		principal=sc.nextFloat();
		System.out.println("Enter the Time period(in years)");
		time=sc.nextFloat();
		computeInterest();
	}
	void computeInterest() {
		si=(principal*rate*time)/100;
		displayInterest();
	}
	void displayInterest() {
		System.out.println("SI for your loan is:"+si);
	}
	
}

public class BasicLoanApp {

	public static void main(String[] args) {
		LoanAcc loanacc1=new LoanAcc();
		//LoanAcc loanacc2=new LoanAcc();
		//loanacc1.setInputs();
		//loanacc1.computeInterest();
		//loanacc1.displayInterest();

	}

}
