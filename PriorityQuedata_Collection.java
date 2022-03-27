import java.util.*;
class PriorityQuedata_Collection{
    public static void main(String args[]){
        PriorityQueue <Integer> pu=new PriorityQueue();
        pu.add(23);
        pu.add(45);
        pu.add(75);
        pu.add(85);
        pu.add(12);
        pu.remove();
        System.out.println("Elements are :"+pu);
        for(Integer p:pu){
            System.out.println(p);
        }
    } 
}