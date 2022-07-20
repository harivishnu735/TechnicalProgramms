import java.util.*;
class RemoveDuplicates
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      int j;
      int arr[]=new int[n];
      System.out.println("Enter the array Elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
     
      System.out.println("after removing the duplicate elements arry are :");
       for(int i=0;i<n;i++)
        {
          for( j=0;j<i;j++)
          
             if(arr[i]==arr[j])
              break;
            if(i==j)
          System.out.println(arr[i]+" ");
        }
     
    }
  }