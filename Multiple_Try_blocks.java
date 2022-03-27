import java.util.*;
class Multiple_Try_blocks{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        int ar[]={1,3,4,};
        try {
          double c=a/b;
          ar[6]=5;
          System.out.println(c);
        } 
        catch(ArithmeticException e)
        {
          System.out.println(e);
        }
        catch(StringIndexOutOfBoundsException e) 
        {
           System.out.println(e);
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
    }
}