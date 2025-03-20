package practice.parent;

public class Parent {
	
	public static void parentDisplay() {
		System.out.println("Parent display");

	}
	
	protected void parentM1() {
		System.out.println( "Parent Protected ");
		int x = 10;
		System.out.println("I am x from parent protected");

	}

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.parentDisplay();
		parent.parentM1();
	}
}
