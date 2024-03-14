package Strings;

public class ReverseString {

	public static void main(String[] args) {
	    String s = "Hello Im working";
	    String rev = "";
	   // System.out.println("Original string: " + originalStr);
	      for(int i=0; i<s.length(); i++)  
	    	  rev = s.charAt(i) + rev;
	      System.out.println(rev);
	    	
	   // System.out.println(reversedStr);
	  }
}
