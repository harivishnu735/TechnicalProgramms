import java.util.*;
class FindFruit_Collection{
    public static void main(String args[]){
        ArrayList<String> fu=new ArrayList();
        fu.add("Banana");
        fu.add("Apple");
        fu.add("Mango");
        fu.add("Grapes");
        for(String f:fu){
         if(f.equals("Mango")){
            System.out.println("It Is Found");
         }
        }
        
    }

}