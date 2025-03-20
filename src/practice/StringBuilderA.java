package practice;
//program to reverse a string using stringBuulder
public class StringBuilderA {

	public static void main(String[] args) {
		StringBuilderA stringBuilderA = new StringBuilderA(); //object of class 
		String aa = "AABBaabb";
		String revrse =  stringBuilderA.getReverse(aa);
		//System.out.println(revrse);
		
	}
	
	public String getReverse(String name) {
		StringBuilder sb = new  StringBuilder(name);
		System.out.println(sb.reverse());
		
		return sb.reverse().toString(); //revrse is from StringBuilder, return object and we want string so use toString.
	}
}
