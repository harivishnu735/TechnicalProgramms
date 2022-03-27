import java.util.*;
class HashMapdata_Collection{
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap();
        hm.put(1,"Orange");
        hm.put(2,"Grapes");
        hm.put(3,"Apple");
        hm.put(4,"Frooti");
        hm.put(5,"Orange");
        for(Map.Entry h:hm.entrySet()){
            System.out.println(h.getKey()+","+h.getValue());
        }
        System.out.println(hm);
    }
}