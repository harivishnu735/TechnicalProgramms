import java.util.*;
class MaxNum_Collection{
    public static void main(String args[]){
        ArrayList<Integer> num=new ArrayList();
        num.add(12);
        num.add(18);
        num.add(55);
        num.add(66);
        num.add(89);
        num.add(19);
        num.add(98);
        num.add(175);
        num.add(268);
        num.add(79);
        int max =num.get(0);
        int n=num.size();
        System.out.println("Total SiZe :"+num.size());
        System.out.println("********MaxNumber Details***********");
      for(int i=1;i<n;i++){
          if(num.get(i)>max){
             max=num.get(i); 
          }
      }
      System.out.println(max);
    }
}