//Wap to find sum of digits of a given number 
import java.util.*;
public class SumOf_Digits
{
	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the digits");
	int dig=sc.nextInt();
	int sum=0;
	while(dig>0){
	    int rem=dig%10;
	         sum=sum+rem;
	        dig=dig/10;
	}
     System.out.println("Sum Of :"+sum);  

	}
}
