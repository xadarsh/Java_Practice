//Dependent Object

public class Students {
	private String sname;
	private Integer rollno;
	private String course;
	private String branch;
	private Integer year;
	private String section;
	
	
	public void setdata(String sname,Integer rollno,String course,String branch,Integer year,String section)
	{
		this.sname=sname;
		this.rollno=rollno;
		this.course=course;
		this.branch=branch;
		this.year=year;
		this.section=section;
	}
	public String getName()
	{
		return sname;
	}
	public Integer getRollno()
	{
		return rollno;
	}
	public String getCourse()
	{
		return course;
	}
	public String getBranch()
	{
		return branch;
	}
	public Integer getYear()
	{
		return year;
	}
	public String getSection()
	{
		return section;
	}
}
