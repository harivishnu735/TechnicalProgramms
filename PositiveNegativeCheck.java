import java.util.*;
class PositiveNegativeCheck{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number:");
num=sc.nextInt();
if(num>0)
{
System.out.println("The num is Positive");
}
else if(num<0)
{
System.out.println("The num is Negative");
}
else
{
System.out.println("The num is Zero");    
}
}
}