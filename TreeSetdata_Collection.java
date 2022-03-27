import java.util.*;
class TreeSetdata_Collection{
    public static void main(String args[]){
        TreeSet <Integer> ts=new TreeSet();
        ts.add(23);
        ts.add(45);
        ts.add(75);
        ts.add(85);
        ts.add(45);
       // ts.remove(2);
        System.out.println("Elements are :");
       
        for(Integer t:ts){
            System.out.println(t);
        }
    } 
}