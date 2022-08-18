import java.util.*;
class BubleSort
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
      for(int i=0;i<n-1;i++){ //number of iterations
        System.out.println("No Of passes ;"+(i+1));
        for(int j=0;j<n-1;j++){  //number of compilations
          if(ar[j+1]<ar[j]){
            temp=ar[j+1];
            ar[j+1]=ar[j];
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