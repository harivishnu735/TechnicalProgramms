import java.util.*;
class ReverseNum_Collection{
    public static void main(String args[]){
        ArrayList <Integer> re=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            re.add(sc.nextInt());
            
        }
      
        Collections.reverse(re);
       System.out.println("Reversed Elements are ");  
       for(Integer r:re){
        System.out.println(r);    
       }
    }
}