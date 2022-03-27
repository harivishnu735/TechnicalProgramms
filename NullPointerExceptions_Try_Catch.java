import java.util.*;
class NullPointerExceptions_Try_Catch{
    public static void main(String args[]){
    String c=null;
   try{
    System.out.println(c.length());
   }
   catch(Exception e)
   {
     System.out.println(e);
   }
   System.out.println(c);
    }
}