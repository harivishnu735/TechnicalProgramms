import java.util.*;
class SelectionSort
  {
    public static void main(String args[])
    {
     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Array size ");
      int n=sc.nextInt();
      
       int temp=0;
      int ar[]=new int[n];
      System.out.println("Enter Array Elements ");
      for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
      }
      System.out.println("Before Swapping ");
      for(int i=0;i<n;i++){
        System.out.println(ar[i]+" ");
      }
      for(int i=0;i<n;i++){ //number of iterations
        for(int j=i+1;j<n;j++){  //number of compilations
          if(ar[i]>ar[j]){
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
          }
        }
      }
       System.out.println("After Swapping ");
      for(int i=0;i<n;i++){
        System.out.println(ar[i]+" ");
      }
    }
  }