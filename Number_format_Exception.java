import java.util.*;
class Number_format_Exception{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter FirstName");
        String fname=sc.nextLine();
        System.out.println("Enter LastName");
        String lname=sc.nextLine();
        System.out.println("Enter Mobilenum ");
        String num=sc.next();
       try{
           long l=Long.parseLong(lname);
          
       } 
       catch(Exception e){
           System.out.println(e);
       }
       System.out.println("FirstName :"+fname);
       System.out.println("LastName :"+lname);
       System.out.println("Mobilenum :"+num);
       
    }
}