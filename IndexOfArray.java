import java.util.*;
class IndexOfArray
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      
      int arr[]=new int[n+1];
      System.out.println("Enter the array Elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Enter Specific Index");
      int index=sc.nextInt();
      System.out.println("Enter your element");
      int ele=sc.nextInt();
      for(int i=n;i>index;i--)
        {
          arr[i]=arr[i-1]; 
        }
       arr[index]=ele;
      n++;
      for(int i=0;i<n;i++)
        {
          System.out.print(arr[i]+" ");
        }
      
      
    }
  }