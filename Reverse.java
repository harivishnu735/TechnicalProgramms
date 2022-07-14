//WAP to Reverse the given Number

import java.util.*;
public class Reverse
{
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the digits");
	int dig=sc.nextInt();
	int rev=0;
	while(dig>0){
	    int rem=dig%10;
	         rev=rev*10+rem;
	        dig=dig/10;
	}
     System.out.println("Reversed Number :"+rev);  
	//System.out.println("Odd sum :"+sum);
	}
}
