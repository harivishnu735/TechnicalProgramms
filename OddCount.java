import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Start and Stop Values");
	    int start=sc.nextInt();
	    int stop=sc.nextInt();
	    int count=0;
	    System.out.println("Between "+start+" to "+stop+" Odd Values are ");
	    for(int i=start;i<stop;i=i+2)
	    {
	        count++;
	        System.out.println(i);
	    }
	       System.out.println("Total Values are :"+count);
	}
}
