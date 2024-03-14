package Strings;

public class FindDuplicates {

	public static void main(String[] args) {
     String str = "madam";
     char[] carray = str.toCharArray();
     System.out.println("The string is:" + str);
           for(int i =0; i<str.length(); i++) {
    	  for(int j=i+1; j<str.length(); j++) {
    		 // System.out.print("Duplicate Characters in above string are: ");
    		  if(carray[i]==carray[j]) {
    			  System.out.println(carray[j]);
    		      //  if (carray[i] == carray[j]) {
//    		           System.out.print(carray[j] + " ");
//    		           break;
    		        }
    	  }
           }
	}

}
