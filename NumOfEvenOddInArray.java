import java.util.*;
 class NumOfEvenOddInArray{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int even,odd;
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();    
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
         System.out.println();
         System.out.println("The Even Elements are :");
        for(int i=0;i<n;i++){
          if(ar[i]%2==0){
             System.out.print(ar[i]+" "); 
          }
        }
         System.out.println();
         System.out.println("The Odd Elements are :");
        for(int i=0;i<n;i++){
            if(ar[i]!=0){
                 System.out.print(ar[i]+" ");
            }
        }
        
    }
}