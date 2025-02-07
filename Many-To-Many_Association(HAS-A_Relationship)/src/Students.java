
public class Students {
	private String sname;
	private Integer rollno;
	private String course;
	private Integer year;
	private String section;
	private Subjects[] subjects;
	
	public Students(String sname,Integer rollno,String course,Integer year,String section,Subjects[] subjects)
	{
		this.sname=sname;
		this.rollno=rollno;
		this.course=course;
		this.year=year;
		this.section=section;
		this.subjects=subjects;
	}
	public void getData()
	{
		System.out.println("Name		::"+sname);
		System.out.println("Roll number	::"+rollno);
		System.out.println("Course		::"+course);
		System.out.println("Year		::"+year);
		System.out.println("Section		::"+section);
		System.out.print("Subjects	::");
		for(Subjects s:subjects)
		{
			System.out.print(s.getSubject()+" ");
		}
		System.out.println("");
		System.out.println("=========================================");
	}
}
