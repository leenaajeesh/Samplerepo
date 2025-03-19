package polymorphism;

public class PolymorphismChild extends PolymorphismParent {
	public void sum(int a,int b)
	{
	
		int x=a+b;
		System.out.println("child sum="+x);
		super.sum(5, 2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismChild obj=new PolymorphismChild();
		obj.sum(2, 4);
		
	}

}
