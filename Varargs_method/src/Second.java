/* 1. Case-1> Valid Signature
 * 			
 * 			i) public void methodName(int... x)
 * 			ii)public void methodName(int ...x)
 * 			iii)public void methodName(int...x)
 * 
 * 2. Case-2>We can mix normal argu. with var-arg but var-arg must be always last.
 * 	
 * 			i) public void methodName(int... x, int y) //Invalid
 * 			ii) public void methodName(String s,int... x)// valid
 * 			iii)public void methodName(int x,int...y) ///valid
 * 
 * 3. Case-3> In an argument list there should be only one var arg
 * 		
 * 		i) public void methodName(int y, int...z)	//valid
 * 		ii) public void methodName(int...x , int... y) //invalid
 * 
 * 4. Case-4> We can overload var arg method but var arg method will get a call only if none of
 * 			  matches are found. (just like default statement of switch case.)
 * 
 * 5. Case-5> No two same signature method can me exist in one class
 * 			eg:
 * 				public void m1(int... x) --->internally--> m1(int[] x)
 * 				public void m1(int[] x)
 * 
 * 				both method signature is same and hence they can not exist in same class at a same time
 * 
 * Note:
 * i)Whereever SingleDimension array is present we can replace it with var arg.
 * 	eg: public static void main(String[] arg)---> (String... arg)
 * 
 * ii)Whereever var arg is present we can not replace it with SingleDimension array/
 * 	eg:public void add(int... x)---> (int[] x)-->invalid
 * 
 * 
 * Because: 
 * m1(int... x)=> we can call to this method by passing group of int values or 1D array and 
 * 				  x will become 1D array internally (int[] x)
 * m1(int[] x)=> we can call to this method by passing 1D array only.
 */
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
 * Note: 
 * 		To accept the multiple arguments of 1D array then we have to make the ellipse of 1D array
 * 		eg: public void methodName(int[]... x)--->internally(int[][] x)
 * 
 * eg:
 * 	class Test
 * {
 * 	public void m1(int[]... x)
 * 	{
 * 		for(int[] i:x)
 * 		{
 * 			for(int ele: i)
 * 				System.out.println(ele);
 * 		}
 * 	}
 * 	public static void main(String... s)
 * 	{
 * 		Test t=new Test();
 * 		int[] a={10,20};
 * 		int[] b={30,40};
 * 
 * 		t.m1(a,b);
 * 	}		
 * }
 */
