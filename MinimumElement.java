import java.util.*;
 class MinimumElement{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int min;
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();    
        int ar[]=new int[n];
      
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        min=ar[0];
        for(int i=0;i<n;i++){
          if(min>ar[i]){
              min=ar[i];
          }
        }
         System.out.println("Minimum value is :"+min);
    }
}