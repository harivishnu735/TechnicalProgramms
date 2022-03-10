import java.util.*;
class Negative{
    public static void main(String args[]){
        int neg=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int ar[]=new int[10];
        for(int i=0;i<5;i++){
           ar[i]=sc.nextInt();
        }
       for(int i=0;i<5;i++){
          if(ar[i]<0)
          {
          neg=ar[i];
           System.out.println(neg);
          }
       } 
    }
}