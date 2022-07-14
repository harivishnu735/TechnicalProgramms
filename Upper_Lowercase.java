// Check Character is Upper Case or Lower Case 

 import java.util.*;
public class Upper_Lowercase
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch =sc.next().charAt(0);
		
	 if((ch>='A' &&ch<='Z'))
		   	System.out.println("It is a UpperCase ");
	
	      else
	       System.out.println("It is a LowerCase "); 
	}
}