import java.util.*;
class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of arry Elements ");
    int n=sc.nextInt();
    int i,j;
    int arr[]=new int[n];
    System.out.println("Enter the Array Elements ");
    for( i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("After Removing the Duplicate elements ");
    for( i=0;i<n;i++)
      {
        for( j=0;j<i;j++)
          {
            if(arr[i]==arr[j])
              break;
          }
            if(i==j)
        System.out.println(arr[i]+" ");
      }
  }
}