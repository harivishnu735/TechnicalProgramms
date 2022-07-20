import java.util.*;
class SecondLargest{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of arry Elements ");
    int n=sc.nextInt();
    int i,j,temp;
    int arr[]=new int[n];
    System.out.println("Enter the Array Elements ");
    for( i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
    
    for( i=0;i<n;i++)
      {
        for( j=i+1;j<n;j++)
          {
            if(arr[i]>arr[j])
            {
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
          }
        
      }
     System.out.println("Second largest one "+arr[n-2]);
  }
}