package practice;

public class MutableVsImmutableExample {
    public static void main(String[] args) {
        MutableVsImmutableExample mutableVsImmutableExample = new MutableVsImmutableExample();
        String name = "anuja";
        
        // Showing String (immutable)
        mutableVsImmutableExample.showImmutable(name);
        
        // Showing StringBuilder (mutable)
        mutableVsImmutableExample.showMutable(name);
    }

    // Method to demonstrate String immutability
    private void showImmutable(String name) {
        String str1 = "anuja";             // A string literal
        String str2 = name.toUpperCase();  // Applying toUpperCase() creates a new String object in heap memory.

        // The toUpperCase() method creates a new string with all characters in uppercase.
        // It doesn't modify the original string, rather it returns a new string.
        System.out.println("After applying change on the name string: " + str2);
        
        // Comparing str2 (newly created string) with a string literal
        String str3 = "ANUJA"; // A string literal with value "ANUJA"

        // Here, both str2 and str3 have the same value but refer to different objects.
        System.out.println("Are str2 and str3 the same object? " + (str2 == str3)); // false
        System.out.println("Are str2 and str3 equal in content? " + str2.equals(str3)); // true
        // Explanation:
        // `str2 == str3` checks if both strings point to the same object in memory (which they don't).
        // `str2.equals(str3)` checks if the contents of the strings are the same (which they are).
    }

    // Method to demonstrate StringBuilder mutability
    private void showMutable(String name) {
        StringBuilder sb = new StringBuilder();  // Create a new StringBuilder object
        
        // Append the new string to the StringBuilder object
        sb.append(name + " change updated");

        // The StringBuilder is mutable, meaning we can modify it in place
        // The content of sb changes without creating a new object every time
        String updatedName = sb.toString();  // Convert the StringBuilder back to a String
        System.out.println("After applying toString, we can see the changed string: " + updatedName);
        
        // Note: StringBuilder modifies the same object in memory, so there is no need for creating a new object every time.
    }
}
