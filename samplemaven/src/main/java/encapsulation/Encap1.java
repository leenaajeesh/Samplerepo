package encapsulation;

public class Encap1 {
	String name;
	int rollno;

	public void setter(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public void getter()
	{
		System.out.println(name+" "+rollno);
	}

}
