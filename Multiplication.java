import java.util.Scanner;
class Multiplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int i=1;
        while(i<=15){
        int sum=num*i;    
          System.out.println(num+ " * "+i+" = "+sum);
          i++;
        }
    } 
}