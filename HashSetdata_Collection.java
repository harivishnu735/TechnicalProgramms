import java.util.*;
class HashSetdata_Collection{
    public static void main(String args[]){
        HashSet <Integer> hs=new HashSet();
        hs.add(13);
        hs.add(52);
        hs.add(69);
        hs.add(85);
        hs.add(null);
        hs.add(13);
        hs.add(null);
        hs.remove(2);
       // hs.indexOf(52);
        System.out.println("Elements are :"+hs);
        for(Integer h:hs){
            System.out.println(h);
        }
    } 
}