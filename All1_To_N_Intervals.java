import java.util.*;
public class All1_To_N_Intervals {
   public static void main(String args[]){
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Any Number");
      int opt=sc.nextInt();
      while(opt!=0){
      System.out.println("1 for Amstrong numbers ::");
      System.out.println("2 for Prime numbers ::");
      System.out.println("3 for Perfect numbers ::");
      System.out.println("4 for Palindrome numbers ::");
      
      System.out.println("Enter your Option");
     int option=sc.nextInt();
      switch(option){
        case 1:
      System.out.println("Enter the first number ::");
      num1 = sc.nextInt();
      System.out.println("Enter the Ending number ::");
      num2 = sc.nextInt();
     System.out.println("Amstrong numbers Between "+num1+" To "+num2+" Are ::");
    for(int i=num1;i<num2;i++)
    {
      double digits=0,sum=0;
      int temp=i;
      while(temp>0){
        temp=temp/10;
        digits++;
      }
      temp=i;
      while(temp>0){
        double rem=temp%10;
        sum=sum+Math.pow(rem,digits);
        temp=temp/10;
      }
      if(sum==i){
        System.out.println(i+" Is Amstrong Number");
       }
      
     }System.out.println("\n\n");
      break;
        case 2:
      System.out.println("Enter the first number ::");
      num1 = sc.nextInt();
      System.out.println("Enter the Ending number ::");
      num2 = sc.nextInt();
      System.out.println("Prime numbers Between "+num1+" To "+num2+" Are ::");
          for(int i=num1;i<=num2;i++)
            {
              int count=0;
               for(int j=2;j<i;j++)
                 {
                   if(i%j==0){
                     count++;
                   }
                 }
               if(count==0)
               {
                 System.out.print(i+" ");
               }
            }System.out.println("\n\n");
      break;
        case 3:
      System.out.println("Enter the first number ::");
      num1 = sc.nextInt();
      System.out.println("Enter the Ending number ::");
      num2 = sc.nextInt();
      System.out.println("Perfect numbers Between "+num1+" To "+num2+" Are ::");
          for(int i=num1;i<=num2;i++)
            {
              int sum=0;
              for(int j=1;j<i;j++)
                {
                  if(i%j==0)
                  {
                    sum=sum+j;
                  }
                }
              if(sum==i)
              {
                System.out.print(sum+" ");
              }
            }System.out.println("\n\n");
      break;
        case 4:
      System.out.println("Enter the first number ::");
      num1 = sc.nextInt();
      System.out.println("Enter the Ending number ::");
      num2 = sc.nextInt();
      System.out.println("Palindrome numbers Between "+num1+" To "+num2+" Are ::");

          for(int i=num1;i<=num2;i++)
            {
              int rem,rev=0;
              int temp=i;
              while(temp!=0)
                {
                  rem=temp%10;
                  rev=rev*10+rem;
                  temp=temp/10;
                }
              if(rev==i)
              {
                System.out.print(rev+" ");
              }
            }System.out.println("\n\n");
          break;
          default :
            System.out.println("Invalid option");
   }
  }
 }
}