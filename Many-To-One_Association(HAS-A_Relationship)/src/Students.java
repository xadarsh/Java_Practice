//Target Object
public class Students {
	private String sname;
	private Integer rollno;
	private String course;
	private Integer year;
	private String section;
	private Branch branch;
	
	//Setter and getter Dependency Injection
	//Setter
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public void setRollno(Integer rollno)
	{
		this.rollno=rollno;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public void setYear(Integer year)
	{
		this.year=year;
	}
	public void setSection(String section)
	{
		this.section=section;
	}
	public void setBranch(Branch branch)
	{
		this.branch=branch;
	}
	
	//Getter
	public String getSname() {
		return sname;
	}
	public Integer getRollno() {
		return rollno;
	}
	public String getCourse() {
		return course;
	}
	public Integer getYear() {
		return year;
	}
	public String getSection() {
		return section;
	}
	public String getBranchName() {
		return branch.getBname();
	}
	public Integer getBranchId()
	{
		return branch.getBid();
	}
	
}
