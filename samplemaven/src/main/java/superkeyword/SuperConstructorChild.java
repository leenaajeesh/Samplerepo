package superkeyword;

public class SuperConstructorChild extends SuperConstructor {
	public SuperConstructorChild()
	{
		super(2,4);
		System.out.println("child Constructor");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj=new SuperConstructorChild();
		

	}

}
