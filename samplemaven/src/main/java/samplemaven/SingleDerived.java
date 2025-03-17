package samplemaven;

public class SingleDerived extends SingleParent {
	public void display1()

	{
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDerived obj=new SingleDerived();
		obj.display();
		obj.display1();
	}

}
