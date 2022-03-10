import java.util.*;
 class FrequencyOfNum{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int count=0;
        System.out.println("Enter the Array size :");
      int n=sc.nextInt();    
        int ar[]=new int[n];
      
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("Frequency of a number :");
        int num=sc.nextInt();
        for(int i=0;i<n;i++){
          if(ar[i]==num){
             count= count+1;
          }
        }
        System.out.println("Found  "+count);
         if(count==0){
      
             System.out.println("Not found");
         }
    }
}