import java.util.*;
class PerfectNumber{
    public static void main(String args[])
    {
        long n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        n=sc.nextInt();
        int i=1;
        while(i<=n/2){
       if(n%i==0){
        sum=sum+i;
       }i++;
       }
       if(n==sum){  
      System.out.println(n+ "  It is a Perfect Number :");
        }
    else{
       System.out.println(n+"  It is not a Perfect Number :");  
       }
   }
}