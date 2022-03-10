import java.util.*;
 class NegativeElementsInArray{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int neg;
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();    
        int ar[]=new int[n];
      
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        neg=ar[0];
        for(int i=0;i<n;i++){
          if(neg<ar[i]){
              neg=ar[i];
          }
        }
         System.out.println("The negative  Elements are :"+neg);
    }
}