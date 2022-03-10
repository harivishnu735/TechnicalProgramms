import java.util.*;
 class ArrayEx2{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();    
        int ar[]=new int[n];
      
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
         System.out.println("The Elements are");
        for(int i=0;i<n;i++){
     System.out.println(ar[i]);
        }
    }
}