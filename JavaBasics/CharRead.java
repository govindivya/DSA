package govindProject;

import java.util.Scanner;
                             // This program is to convert uppercase letter to lower case and vice-versa;
public class CharRead {   
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
       

		System.out.println("Enter a String");
        String  Str= sc.nextLine();
        int count1=0;
         int count2=0;
         System.out.println("Given String is : " + Str);
         System.out.println("\nNew String after changing every character  to lowercase ");
       
         for(int i=0;i< Str.length();i++) {  // this loop is to change every character to lowercase;
            
        	 char chr=Str.charAt(i);
		     int num1=(int)chr;
		  
		          if(num1>=(int)'A' && num1<=(int)'Z')  {	
			            
		        	     char A= (char)(num1+32);
			             count1++;
			             System.out.print(A);
		
	        	}
		          else
			             System.out.print(Str.charAt(i));
	
      }
       System.out.println("\n New String after changing  every character  to Uppercase");
     
       for(int i=0;i<Str.length();i++) {  // this loop is to change every character to Uppercase;
    	  char chr=Str.charAt(i);
    	  int num1=(int)chr;
     	    
    	  if(num1>=(int)'a' && num1<=(int)'z')  { 

			   char A= (char)(num1-32);
			   count1++;
			   System.out.print(A);
	   }
     	else
     		System.out.print(Str.charAt(i));
      }
	 
  
   }
}