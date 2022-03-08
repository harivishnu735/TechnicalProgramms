import java.util.Scanner;
class ProductOfNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int fact=1,i=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("Product of the digits of given number :"+fact);
    } 
}