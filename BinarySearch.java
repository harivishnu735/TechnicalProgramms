import java.util.*;
class BinarySearch
  {
    public static void main(String args[])
    {
     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Array size ");
      int n=sc.nextInt();
      int mid=0;
       int temp,low=0,high=n-1;
      int ar[]=new int[n];
      System.out.println("Enter Array Elements ");
      for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
      }
      
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(ar[i]>ar[j]){
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
          }
        }
      }
      System.out.println(" \nSorted Array is");
      for(int i=0;i<n;i++){
        System.out.println(ar[i]+" ");
      }
       System.out.println("Enter the search Value");
      int key=sc.nextInt();
      while(low<=high){
         mid=(low+high)/2;
        if(key==ar[mid]){
          //pos=mid;
          System.out.println("The Value is Present in Index :"+mid);
          break;
        }
        else if(key<ar[mid]){
          high=mid-1;
        }
        else{
          low=mid+1;
        }
      }
      if(low>high){
        System.out.println("The Value "+key+" is not Present in any Index ");
      }
    }
  }