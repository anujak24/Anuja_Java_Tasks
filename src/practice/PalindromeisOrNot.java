package practice;
class PalindromeisOrNot{
  
  public  boolean isPalindromeOrNot(String name){
    int len = name.length();
    //check for even
    if(len%2 ==0){
      for(int i = 0 ; i<len/2 ; i++){
        if(name.charAt(i) != name.charAt(len-1-i)){
        return false;
        }
      }
    } 
    
    else if(len%2 != 0){
      for(int i = 0 ; i<len/2 -1 ; i++){
        if(name.charAt(i) != name.charAt(len-1-i)){
          return false;
        }
      }
    } 
      
    return true;
    }
    

  public static void main (String[] args) {
	PalindromeisOrNot a = new PalindromeisOrNot();
    String name1 = "jabbaaa";
    String name2 = "abba";
    System.out.println("input String is:"+name1+ " is palindrome  " +a.isPalindromeOrNot(name1));
    System.out.println("input String is: "+name2+ " is palindrome  " +a.isPalindromeOrNot(name2));

  }
  
  
}