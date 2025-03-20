package practice;

public class StringBuilderAndStringDiff {

	public static void main(String[] args) {
		// Example with String (Immutable)
		String str = "Hello";
		System.out.println("Original String: " + str);
		str = str.concat(" World"); // Creates a new object
		System.out.println("Modified String: " + str);

		// Example with StringBuilder (Mutable)
		StringBuilder stringBuilder = new StringBuilder("Hello");
		System.out.println("\nOriginal StringBuilder: " + stringBuilder);
		stringBuilder.append(" World"); // Modifies the same object
		System.out.println("Modified StringBuilder: " + stringBuilder);

	}

}
