package samplemaven;

public class HierarchiDerived1 extends HierarchiParent {
	public void display1()
	{
		System.out.println("This is Class Heirarchical Derived class1");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchiDerived1 obj=new HierarchiDerived1();
		obj.display();
		obj.display1();

	}

}
