import java.util.*;
class FrequencyOfElement
  {
    public static void main(String args[] )
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array ");
      int n=sc.nextInt();
      int arr[]=new int[n];
       int fr[]=new int [n];
      int count;
      System.out.println("Enter the array Elements");
      for(int i=0;i<n;i++)
        {
          fr[i]=0;
        }
      for(int i=0;i<n;i++)
        {
          
          arr[i]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
         {
           count=1;
           for(int j=i+1;j<n;j++)
           {
             if((fr[j]==0)&&(arr[i]==arr[j]))
             {
               count++;
          
               fr[j]=1;   
             }
             
           }
             if(fr[i]==0)
           System.out.println(arr[i]+"==="+count);
             
           }
    
     
    }
  }