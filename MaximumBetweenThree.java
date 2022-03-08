import java.util.*;
class MaximumBetweenThree{
public static void main(String args[]){
int num1,num2,num3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number1:");
num1=sc.nextInt();
System.out.println("Enter The Number2:");
num2=sc.nextInt();
System.out.println("Enter The Number3:");
num3=sc.nextInt();
if(num1>num2&&num1>num3)
{
System.out.println("The num1 is Large one");
}
else if(num2>num1&&num2>num3)
{
System.out.println("The num2 is Large one");
}
else
{
System.out.println("The num3 is Large one");    
}
}
}