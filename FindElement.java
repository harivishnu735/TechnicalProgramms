import java.util.*;
class FindElement
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      int flag=0;
      int arr[]=new int[n];
      System.out.println("Enter the array Elements");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Enter Search element");
      int search=sc.nextInt();
      for(int i=0;i<n;i++)
        {
         if(arr[i]==search)
         {
           System.out.println("Element "+search+" Found at "+i+" Position");
           flag=1;
           break;
         }
        }
      if(flag==0)
        {
          System.out.print("Element  "+search+" is not found");
        }
    }
  }