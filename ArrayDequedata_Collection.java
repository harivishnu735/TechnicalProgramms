import java.util.*;
class ArrayDequedata_Collection{
    public static void main(String args[]){
        ArrayDeque <Integer> au=new ArrayDeque();
        au.add(12);
        au.add(55);
        au.add(65);
        au.add(55);
        au.addFirst(10);
        au.addLast(85);
       // au.removeFirst();
        //au.removeLast();
        System.out.println("Elements are :"+au);
         System.out.println("First Removed :"+au.removeFirst()+"\n"+"Last removd :"+au.removeLast() );
    }
}