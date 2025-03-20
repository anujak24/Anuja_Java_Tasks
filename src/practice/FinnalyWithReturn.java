package practice;

public class FinnalyWithReturn {

	static String normalM1() {
		try {
		String str1 = null;
		System.out.println("I am in try before exception");
		//System.out.println(str1.length());
		return "from try";
		}
		catch(Exception m) {
			System.out.println("error handled");
			return "from catch";
		}
		
		finally {
			System.out.println("I am from finally");
		}
		
	}
}
