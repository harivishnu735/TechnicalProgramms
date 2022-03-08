import java.util.*;
class EvenInLoop{
public static void main(String args[]){
int i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Evennumbers :");
int num=sc.nextInt();
System.out.println("Even numbers are");
while(i<=num ){
System.out.print(i+"  ");
i=i+2;
}
}
}