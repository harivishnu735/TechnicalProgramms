import java.util.*;
class Even_Odd{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number:");
num=sc.nextInt();
if(num%2==0){
System.out.println("It is a Even number");
}
else{
System.out.println("It is Odd number");
}
}
}