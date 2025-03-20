package Abstract_Test;

public class Child12 extends P1{

	public static void main(String[] args) {
    Child12 c12 = new Child12();
   // c12.display();
    P1 p = new Child12();
    p.display();
	}

	@Override
	void display() {
		
		System.out.println("Got implemenations");	
		System.out.println("Branch one");
	}

}


