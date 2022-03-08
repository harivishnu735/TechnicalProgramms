import java.util.*;
class SumOfOdd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The numbers :");
int num=sc.nextInt();
int i=1,sum=0;
System.out.println("The Sum Of Odd numbers are");
while(i<=num ){
sum=sum+i;
i=i+2;
}
System.out.print(sum+"  ");
}
}