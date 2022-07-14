import java.util.*;
class ReverseArray
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      int t=0;
      int arr[]=new int[n];
      System.out.println("Enter the array Elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<n/2;i++)
        {
          t=arr[n-i-1];
          arr[n-i-1]=arr[i];
          arr[i]=t; 
          
        }
      System.out.println("Reverse of array elements are");
      for(int i=0;i<n;i++)
       {
         System.out.println(arr[i]);
        }
    }
  }