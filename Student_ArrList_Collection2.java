import java.util.*;
class Student_ArrList_Collection2{
    public static void main(String args[]){
        ArrayList stu=new ArrayList();
        stu.add("Hari");
        stu.add("Mech");
        stu.add(123);
        stu.add("9848765432");
        stu.add("Eluru");
        System.out.println("Total SiZe :"+stu.size());
        System.out.println("********Student Details***********");
      for(int i=0;i<stu.size();i++){
          System.out.println(stu.get(i));
      }
    }
}