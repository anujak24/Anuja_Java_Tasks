package practice;

public class OnlyReturn {

	public static void main(String[] args) {
		System.out.println("I am from main");
		OnlyReturn onlyReturn = new OnlyReturn();
		onlyReturn.normalM1();
	}

	static String normalM1() {
		try {
			//String str10 = null;
			System.out.println("I am in try before exception");
			//System.out.println(str10.length());
			return "from try";
		} catch (Exception m1) {
			System.out.println("I am from catch error handled");
			return " return from catch";
		}

		finally {
			System.out.println("I am from finally");
		}

	}
}
