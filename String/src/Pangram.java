import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		s=s.replace(" ","").toUpperCase();
		char[] arr=s.toCharArray();
		int[] arr2=new int[26];
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			int idx=arr[i]-'A';
			arr2[idx]++;
		}
		for(int j:arr2)
		{
			if(j==0)
			{
				System.out.println("It is not a pangram");
				flag=false;
				break;
			}
		}
		if(flag==true)
			System.out.println("It is a pangram");
	}

}
