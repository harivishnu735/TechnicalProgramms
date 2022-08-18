//Our program is to demonstrate the hash set.
//import the util package
import java .util.*;
class HashsetEx
  {
    public static void main(String args[])
    {

      
      HashSet<String> name=new HashSet<String>();
      System.out.println("name.isEmpty() :"+name.isEmpty());
      name.add("Hari");
      name.add("Vishnu");
      name.add("Krishna");
      System.out.println(name);
      //Retriving the each and element throug for-each loop
      for(String n:name){
        System.out.println("Welcome "+n);
      }
      if(name.isEmpty())
        System.out.println("Names hashset is still empty ");
      else
        System.out.println("Size of the hashset name :"+name.size());
      if(name.contains("Vishnu"))
        name.remove("Vishnu");
      System.out.println("Updated Size of the hashset name :"+name.size());
      name.clear();
      System.out.println("name.isEmpty() after clear :"+name.isEmpty()+"\n");
      
      name.add("Mango");
      name.add("Bannana");
      name.add("Grapes");
      name.add("Apple");
      System.out.println(name);
      //Retriving the each and element throug for-each loop
      for(String fruits:name){
        System.out.println(fruits+" Is Good For Health ");
      }
      System.out.println();
      HashSet <Integer> obj=new HashSet <Integer> ();
      obj.add(10);
      obj.add(30);
      obj.add(50);
      
     /* for(int var:obj){
        System.out.println(var);
      } */
      // iterating elements through iterator
      Iterator<Integer> num= obj.iterator();
      //hasNext() method is used for element is present or not
      while(num.hasNext()){
        //if element is presnt we can retrive through next() method is used
        Integer n=num.next();
        System.out.println(n); 
      }
      System.out.println("Size of the hashset obj :"+obj.size());
      if(obj.contains(30))
        obj.remove(30);
      System.out.println("Updated Size of the hashset obj :"+obj.size());
    }
  }