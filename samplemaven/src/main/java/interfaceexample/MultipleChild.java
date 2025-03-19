package interfaceexample;

public class MultipleChild implements MultipleParentA,MultipleParentB {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleChild obj=new MultipleChild();
		obj.add();
		obj.sum();
		obj.dispaly();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("addition");
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("sum");
		
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("display");
		
	}

}
