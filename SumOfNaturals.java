import java.util.*;
class SumOfNaturals{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Naturalnumbers :");
int num=sc.nextInt();
int i=1,sum=0;
System.out.println("The Sum Of Natural numbers are");
while(i<=num ){
sum=sum+i;
i++;
}
System.out.print(sum+"  ");
}
}