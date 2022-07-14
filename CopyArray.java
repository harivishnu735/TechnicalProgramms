import java.util.*;
class CopyArray
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
      int arr2[]=new int[n];
      System.out.println("Copied array Elements are");
      for(int i=0;i<n;i++)
        {
          arr2[i]=arr[i];
         System.out.println(arr2[i]);
        }
      
    }
  }