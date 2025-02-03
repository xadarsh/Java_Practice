

class Level1
{
	String name="Level 1";
	
	void display() {
		System.out.println("Method of level 1");
	}
}


class Level2 extends Level1
{
	
}

class Level3 extends Level2
{
	
}

//Here Level2 class extends Level1 and Level3 extends Level2
//Level2 get the feature of Level1 and Level3 gets the feature of both Level2 and Level1 

public class MultiLevelInheritance {

	public static void main(String[] args) {

			Level3 l3=new Level3();
			Level2 l2=new Level2();
			
			l3.display();
			System.out.println(l3.name);
			l2.display();
			System.out.println(l2.name);

	}

}
