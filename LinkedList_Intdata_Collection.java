import java.util.*;
class LinkedList_Intdata_Collection{
    public static void main(String args[]){
        LinkedList <Integer> lt=new LinkedList();
        lt.add(12);
        lt.add(55);
        lt.add(65);
        lt.add(55);
        lt.addFirst(10);
        lt.addLast(85);
        System.out.println("Elements are :"+lt);
         System.out.println("Removed element Is :"+lt.remove(2) );
    }
}