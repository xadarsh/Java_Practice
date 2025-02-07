//Dependent Object
public class Branch {
	private String bname;
	private Integer bid;
	
	//Using setter and getter dependency injection
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setBid(Integer bid)
	{
		this.bid=bid;
	}
	public String getBname()
	{
		return bname;
	}
	public Integer getBid()
	{
		return bid;
	}
}
