import java.util.*;
class Vectordata_Collection{
    public static void main(String args[]){
        Vector <Integer> v=new Vector();
        v.add(12);
        v.add(55);
        v.add(65);
        v.add(55);
       // v.addFirst(10);
       // v.addLast(85);
        System.out.println("Elements are :"+v);
         System.out.println("Removed element Is :"+v.remove(3) );
    }
}