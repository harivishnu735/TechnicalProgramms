import java.util.*;
class BloodDonation{
public static void main(String args[]){
int age,weight;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The age :");
age=sc.nextInt();
System.out.println("Enter The Weight :");
weight=sc.nextInt();
if(age>=18 &&weight>=50){
System.out.println("He is eligible to donate");
}
else{
System.out.println("He is not eligible");
}
}
}