import java.util.*;
class ProductOfArray{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the array");
    int n=sc.nextInt();
    int product=1;
    int ar[]=new int[n];
    System.out.println("Enter the Elements ");
    for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
    System.out.println("*******product of array elements *******");
    
    for(int i=0;i<n;i++)
    {
        product=product*ar[i];
       
    }
     System.out.println(product);
    }  
}