import java.util.*;
class StrongNumber{
    public static void main(String args[]){
    int total=0,i;
    int lastdig,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any Number:");
    int n=sc.nextInt();
    int num=n;
    while(n !=0){
        i=1;
        sum=1;
        lastdig=n%10;
    while(i<=lastdig){
       sum=sum*i;
       i++;
      }
    total=total+sum;
    n=n/10;
    }
    if(total==num){
        System.out.println("it is a Strong Number");
        }
    else{
         System.out.println("it is not a Strong Number");
        }
    }
}