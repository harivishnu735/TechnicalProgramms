import java.util.*;
class MaxMin
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the array Elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
     
      System.out.println("after removing the duplicate elements arry are :");
       for(int i=0;i<n-1;i++)
        {
          for(int j=i+1;j<n;j++)
          {
             if(arr[i]==arr[j])
             {
            arr[j]=arr[j-1];
            n--;
             }
           
          }
        }
      for(int i=0;i<n;i++)
        {
          System.out.print(arr[i]+" "); 
        }
    }
  }