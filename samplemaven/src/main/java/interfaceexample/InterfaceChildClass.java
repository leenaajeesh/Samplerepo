package interfaceexample;

public class InterfaceChildClass implements Interface1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceChildClass obj=new InterfaceChildClass();
		obj.display();
		obj.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interfaceparent");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Interfaceshow");
		
	}

}
