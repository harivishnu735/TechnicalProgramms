import java.util.*;
class OddInLoop{
public static void main(String args[]){
int i=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Sum Of ODDnumbers :");
int num=sc.nextInt();
System.out.println("ODD numbers are");
while(i<=num ){
System.out.print(i+"  ");
i=i+2;
}
}
}