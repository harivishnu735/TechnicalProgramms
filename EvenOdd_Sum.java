//WAP to Find sum of Even digits and sum of Odd digits in a given number

import java.util.*;
public class EvenOdd_Sum
{
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the digits");
	int dig=sc.nextInt();
	int esum=0,osum=0;
	while(dig>0){
	    int rem=dig%10;
	    if(rem%2==0)
	     esum=esum+rem;  
	    else
	        osum=osum+rem;
	        dig=dig/10;
	}
     System.out.println("Even sum :"+esum);  
	System.out.println("Odd sum :"+osum);
	}
}
