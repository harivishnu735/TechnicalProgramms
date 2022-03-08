import java.util.*;
class Divisible{
public static void main(String args[]){
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number:");
num=sc.nextInt();
if(num%5==0){
System.out.println("It is Divisible by 5");
}
else{
System.out.println("It is not Divisible by 5");
}
}
}