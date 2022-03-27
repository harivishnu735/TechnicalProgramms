import java.util.*;
class CopyArray_Collection{
    public static void main(String args[]){
        ArrayList <Integer> al=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
            
        }
       ArrayList <Integer> al2=new ArrayList();
        Collections.reverse(al);
        System.out.println(al2);
       System.out.println("Copy Elements ");  
       for(Integer a:al){
        System.out.println(a);    
       }
    }
}