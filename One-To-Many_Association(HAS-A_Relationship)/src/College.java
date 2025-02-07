//Target Object
public class College {
	private String cname;
	private String address;
	private String code;
	private Students[] student;
	
	public void setdata(String cname,String address, String code,Students[] student)
	{
		this.cname=cname;
		this.address=address;
		this.code=code;
		this.student=student;
	}
	public void getData()
	{
		System.out.println("College Name	::"+cname);
		System.out.println("College Code    ::"+code);
		System.out.println("College Address ::"+address);
		System.out.println("================================");
		System.out.println("Student Details ::");
		for(Students s: student)
		{
			System.out.println("Name        ::"+s.getName());
			System.out.println("Roll Number ::"+s.getRollno());
			System.out.println("Course      ::"+s.getCourse());
			System.out.println("Branch      ::"+s.getBranch());
			System.out.println("Year        ::"+s.getYear());
			System.out.println("Section     ::"+s.getSection());
			System.out.println();
		}
	}
}
