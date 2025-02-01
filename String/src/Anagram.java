import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String s1=sc.nextLine();
		
		System.out.println("Enter the second string:");
		String s2=sc.nextLine();
		s1=s1.replace(" ","").toLowerCase();
		s2=s2.replace(" ","").toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=false;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
				continue;
			else
			{
				System.out.println("String is not an Anagram");
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("String is an Anagram");

	}

}
