
public class StudentApp {

	public static void main(String[] args) {
		
		Subjects s1=new Subjects("DAA");
		Subjects s2=new Subjects("DBMS");
		Subjects s3=new Subjects("WT");
		Subjects s4=new Subjects("ITCS");
		Subjects s5=new Subjects("ML");
		Subjects s6=new Subjects("DA");
		
		Subjects[] s= {s1,s2,s3,s4,s5,s6};
		
		Students st1=new Students("Adarsh Maurya",24,"BTech",3,"A",s);
		Students st2=new Students("Abhishek Chauhan",10,"BTech",3,"A",s);
		Students st3=new Students("Anurag Kushwaha",56,"BTech",3,"B",s);
		Students st4=new Students("Suraj Shukla",24,"BTech",3,"B",s);
		Students st5=new Students("Prabhat Yadav",24,"BTech",3,"C",s);
		
		System.out.println("Student Data    ::");
		System.out.println("===============================");
		st1.getData();
		st2.getData();
		st3.getData();
		st4.getData();
		st5.getData();
	}

}
