import java.util.*;
class Finally_Exception{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a value");
        int a=sc.nextInt();
        System.out.println("Enter b value");
        int b=sc.nextInt();
        try {
          double c=a/b;
          System.out.println("Division Total "+c);
    }
    catch (Exception e)
    {
        System.out.println(e);
    }
    finally
    {
      String s="***@Hari@***";
      System.out.println(s);
    }
    System.out.println("****Exception handled***");
    }
}