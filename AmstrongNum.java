import java.util.*;
class AmstrongNum{
    public static void main(String args[])
    {
        int n;
        int sum=0,temp,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        n=sc.nextInt();
         temp=n;
        while(n>0){
         rem=n%10;
         n=n/10;
         sum=sum+(rem*rem*rem);
        
        }
       if(temp==sum){  
      System.out.println(temp+ " It is a Amstrong :" );
        }
    else{
       System.out.println(temp+ " It is not a Amstrong :");  
       }
   }
}