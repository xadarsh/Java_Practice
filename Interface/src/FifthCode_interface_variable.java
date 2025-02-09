/*
 * Inside the interface we can define variables.
 * Inside the interface variables define requirements level constants.
 * Every variable present inside the interface are by default "public static final".
 */

interface X2
{
	/*public static final*/ int x=10; //we can use it but can not modify it.
}


/*
 * Legal variable declarations inside interface->
 * 
 * (i)	int x=10;
 * (ii)	public int x=10;
 * (iii)static int x=10;
 * (iv) final int x=10;
 * (v)  public static int x=10;
 * (vi) public final int x=10;
 * (vii)static final int x=10;
 * (viii) public static final int x=10;
 * 
 * by default variables in an interface are "public static final" so if you don't write it then JVM will do it implicitly.	
 */

//Note:- since the variables are static and final so compulsorily it should be initialized at the time of declaration otherwise it would result in ComplieTimeException











public class FifthCode_interface_variable {

}
