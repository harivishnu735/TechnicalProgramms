import java.util.*;
 class MaximumNumInArray{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int max;
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();    
        int ar[]=new int[n];
      
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        max=ar[0];
        for(int i=0;i<n;i++){
          if(max<ar[i]){
              max=ar[i];
          }
        }
         System.out.println("Maximum value is :"+max);
    }
}