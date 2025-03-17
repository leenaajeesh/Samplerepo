package samplemaven;

public class MultilevelClassC extends  MultilevelClassB{
	public void dispaly2()
	{
		System.out.println("This is Class C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelClassC obj=new MultilevelClassC();
		
obj.dispaly();
obj.dispaly1();
obj.dispaly2();
	}

}
