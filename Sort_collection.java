import java.util.*;
class Sort_collection{
    public static void main(String args[]){
        ArrayList <Integer> so=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            so.add(sc.nextInt());
            
        }
        Collections.sort(so);
       System.out.println("Sorting Elements ");  
        for(Integer s:so){
        System.out.println(s);    
        }
    }
}