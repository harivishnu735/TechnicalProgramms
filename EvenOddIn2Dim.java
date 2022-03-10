import java.util.*;
 class EvenOddIn2Dim{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row size :");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        System.out.println("Enter elements :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             ar[i][j]=sc.nextInt();
            }
             
        }
        System.out.println("Even numbers are :");
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<n;j++)
         
          {
             if(ar[i][j]%2==0)
                 System.out.println(ar[i][j]);
          }
        }
    
      System.out.println("odd numbers are :\n");
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<n;j++)
         {
             if(ar[i][j]%2!=0)
             
                 System.out.println(ar[i][j]);
           }
        }
    }
}