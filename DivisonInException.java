import java .util.*;
class DivisonInException{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the value 1");
    int x=sc.nextInt();
    System.out.println("Enter the value 2");
    int y=sc.nextInt();
    int p[]={7,86,4};
    try{
     int z=(x/y);
    
     System.out.println (p[10]);
      System.out.println(z);
    }
    catch(Exception e){
      System.out.println(e);
    }
  /*  finally{
    System.out.println(++x);
    System.out.println(--y);
    }*/
  }
}