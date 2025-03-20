package practice;

public class FinalyTry {
	//in main its finally with try and catch.
	public static void main(String[] args) {
		try {
			String str = null ;
			System.out.println(str.length());
			System.out.println("I am from try block");// due to issue, this will not execute.
		}
		
		catch(Exception e){
			System.out.println("I am handled from class final");
		}
		finally {
			System.out.println("I am always execute I am finally");
		}
	}
	
	//method to show only finally
	
	
}
