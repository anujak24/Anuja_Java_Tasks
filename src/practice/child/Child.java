package practice.child;

import practice.parent.Parent;

public class Child extends Parent{

	public static void main(String[] args) {
		System.out.println("I am from child");
		Child child = new Child();
		child.parentM1();
	}
}
