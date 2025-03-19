package abstraction;

public class AbstractChild extends AbstractParent{
	public void display()
	{
		System.out.println("this is abstract class");
	}
	public void show1()
	{
		System.out.println("show1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*AbstractChild obj=new  AbstractChild();
		 obj.display();
		 obj.show();
		 obj.show1();*/
		AbstractParent a1= new AbstractChild();//reference creation
		a1.display();
		a1.show();
		
	}

}
