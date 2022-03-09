import java.util.Scanner;
class FactorialReverse{
    public static void main(String args[]){
    int f,n;
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Value ");
     n=sc.nextInt();
     for(f=1;n>=1;n--){
         f=f*n;
     }
     System.out.println("The Factorial of num = "+f);
  }
}