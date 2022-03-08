import java.util.*;
class Intrest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p,t,r,sum;
        System.out.println("Enter the P amount :");
        p=sc.nextInt();
        System.out.println("Enter the How much Time :"); 
        t=sc.nextInt();
         System.out.println("Enter the Rate of Intrest :");
         r=sc.nextInt();
        sum=(p*t*r)/100;
        System.out.println("The Total and Rate of intrest amount is :"+sum);
    }
}