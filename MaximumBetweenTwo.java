import java.util.*;
class MaximumBetweenTwo{
public static void main(String args[]){
int num1,num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number1:");
num1=sc.nextInt();
System.out.println("Enter The Number2:");
num2=sc.nextInt();
if(num1>num2)
{
System.out.println("The "+num1+" is large one ");
}
else 
{
System.out.println("The "+num2+" is large one");
}
}
}