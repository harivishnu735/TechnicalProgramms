import java.util.*;
class CopyOfArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an array size :");
        int n=sc.nextInt();
         int ar[]=new int[n];
        
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
         System.out.println("********Original Array**************\n");     
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
        
        
        int ar1[] =new int[ar.length];
       
        for(int i=0;i<ar1.length;i++){
            ar1[i]=ar[i];
        }
        
        System.out.println("********Copy Array**************\n"); 
        for(int i=0;i<ar1.length;i++){
            System.out.println(ar1[i]);
        }
    }
}