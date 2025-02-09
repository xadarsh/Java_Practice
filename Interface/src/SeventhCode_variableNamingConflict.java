/*Topic--> variable naming conflicts:-
 * 
 * 	(i) Two interfaces can contain a variable with same name and there may be a chance
 * 		variable naming conflict but we can resolve it by using interface names.
 * 		We have to use the variable along with interface name.
 */
interface P
{
	int x=100;
}
interface Q
{
	int x=200;
}
public class SeventhCode_variableNamingConflict implements P,Q{
	public static void main(String[] arg)
	{
		//System.out.println(x);//this will give an error coz there is two x
		  System.out.println("Value of x in P:"+P.x);
		  System.out.println("Value of x in Q:"+Q.x);
	}
}
