package practice;

public class Exception_hanlde {
	//both exceptions ArithmeticException , NullPointerException are siblings.
	public static void main(String[] args) {
		try {
			int x = 9;
			int y = 9;
			int z = y / x;
			System.out.println(z);
			String str = null;
			System.out.println(str.length());

		} catch (ArithmeticException ne) {
			System.out.println("Exception");

		} catch (NullPointerException ne) {
			System.out.println("Null pointer");

		}

	}

}
