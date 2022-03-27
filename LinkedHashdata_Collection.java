import java.util.*;
class LinkedHashdata_Collection{
    public static void main(String args[]){
        LinkedHashSet <Integer> lh=new LinkedHashSet();
        lh.add(23);
        lh.add(45);
        lh.add(75);
        lh.add(85);
        lh.add(null);
        lh.add(45);
        lh.add(null);
        lh.remove(2);
        System.out.println("Elements are :"+lh);
        for(Integer l:lh){
            System.out.println(l);
        }
    } 
}