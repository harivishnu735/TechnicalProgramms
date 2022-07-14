// Find the Basic Salary of a employee and calculate gross salary ?

import java.util.*;
public class Employee_Salary
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Basic Salary ");
		int bsalary =sc.nextInt();
		int hra=0,da=0,gsalary=0;
		
		if (bsalary<=10000)
	    {
		   hra=(bsalary*20)/100;
		   da=(bsalary*80)/100;
		   gsalary=bsalary+hra+da;
		   System.out.println("Hra Is :"+hra);
		   System.out.println("Da Is :"+da);
		   System.out.println("Gross Salary is :"+gsalary);
		  
		}
		else if(bsalary>=20000 &&bsalary<=10000)
		{
		   hra=(bsalary*25)/100;
		   da=(bsalary*90)/100;
		   gsalary=bsalary+hra+da;
		   System.out.println("Hra Is :"+hra);
		   System.out.println("Da Is :"+da);
		   System.out.println("Gross Salary is :"+gsalary);
		    
		}
		else
		{
		   hra=(bsalary*30)/100;
		   da=(bsalary*95)/100;
		   gsalary=bsalary+hra+da;
		   System.out.println("Hra Is :"+hra);
		   System.out.println("Da Is :"+da);
		   System.out.println("Gross Salary is :"+gsalary);  
		}
	
	}
}