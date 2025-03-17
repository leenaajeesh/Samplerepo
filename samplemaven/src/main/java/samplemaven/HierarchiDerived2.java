package samplemaven;

public class HierarchiDerived2 extends HierarchiParent {
	public void display2()
	{
		System.out.println("This is Class Heirarchical Derived class2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchiDerived2 obj=new HierarchiDerived2();
		obj.display();
		obj.display2();

	}

}
