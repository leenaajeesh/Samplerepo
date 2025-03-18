package assignment9super;

public class AdditionResultsuper1 extends AdditionResultSuper{


	public void  additionresultdiv()
	{
		int x=super.additionresult();
		if(x%10==0)
		{System.out.println("Divisible");}
		else
		{
			System.out.println("not divisble");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdditionResultsuper1 obj=new AdditionResultsuper1();
		obj.additionresultdiv();
	}

}
