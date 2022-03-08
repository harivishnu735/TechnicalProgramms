import java.util.*;
class FirstAndLastNumber{
    public static void main(String args[]){
        int rev=0,n,sum;
        int firstnum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        n=sc.nextInt();
        int lastnum=n%10;
        while(n!=0){
           int r =n%10;
           rev=rev*10+r;
           n=n/10;
        }
     firstnum=rev%10;
      sum=  firstnum+lastnum;
      System.out.println("The Sum Of First and Last number :"+sum);
    }
}