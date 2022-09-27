import java.util.*;
public class PrimeIntervals
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    System.out.print("Enter Start value : ");
	    int n=sc.nextInt();
	     int count=0;
	    System.out.print("Enter End Value : ");
	    int m=sc.nextInt();
	    //int count=0;
	    for(int i=n;i<=m;i++){
	    for(int j=2;j<i;j++){
	        if(i%j==0){
	         count++;
	    }
	    }
	    if(count==0){
	    System.out.print(i+" ");
	    }
	    count=0;
	    }
	}
}
