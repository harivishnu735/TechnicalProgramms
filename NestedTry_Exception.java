import java.util.*;
class NestedTry_Exception{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        int ar[]={1,3,4,};
        try {
          double c=a/b;
          System.out.println("Division Total "+c);
         System.out.println("Outer one Excuted ");
        try {
             ar[4]=5;
          System.out.println(ar[4]);
        }
        catch(ArithmeticException e)
        {
          System.out.println(e);
        }
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }
}