import java.util.*;
public class StartStop
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Start and Stop Values");
	    int start=sc.nextInt();
	    int stop=sc.nextInt();
	    System.out.println("Between "+start+" to "+stop+" Values are ");
	    for(int i=start+1;i<stop;i++)
	    {
	        System.out.println(i);
	    }
	}
}
