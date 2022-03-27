import java.util.*;
class Arithematic_Try_Exception{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n1 value ");
        int n1=sc.nextInt();
         System.out.println("Enter n2 value ");
        int n2=sc.nextInt();
         System.out.println("Enter any operator('+','-','*','/') ");
        char c=sc.next().charAt(0);
        int result;
        switch (c){
            case '+':
         result=n1+n2;
         System.out.println("Addition Is :"+result);
         break;
         
         case '-':
        result=n1-n2;
        System.out.println("Subtraction Is :"+result);
         break;
        case '*':
        result=n1*n2;
        System.out.println("Multiplication Is :"+result);
         break;
        case '/':
            try {
        result=n1/n2;
        System.out.println("Division Is :"+result);
         break;
            }
        catch (Exception e)
        {
         System.out.println(e);
        }
        default:
         System.out.println("Error ! Operator is not correct.");
        }
    }
}