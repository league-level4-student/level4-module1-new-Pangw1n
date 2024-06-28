package _02_Intro_To_Abstract_Classes_and_Interfaces;

public class ClassDemo extends AbstractClassDemo {

	@Override
	public void abstractDemo() {
		// TODO Auto-generated method stub
		System.out.print("Demo Method");
	}

	@Override
	public int abstractNumDemo() {
		// TODO Auto-generated method stub
		return super.num;
	}

}
