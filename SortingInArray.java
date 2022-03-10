import java.util.*;
 class SortingInArray{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();    
        int ar[]=new int[n];
       System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
         for(int j=i+1;j<n;j++){
             if(ar[i]>ar[j]){
                 int temp=ar[i];
                     ar[i]=ar[j];
                     ar[j]=temp;
                }
           }
        }
        //printing sorted order
         System.out.println("****Sorted Array is*********");
         for(int i=0;i<n;i++){
             System.out.println(ar[i]);
         }
    }
}