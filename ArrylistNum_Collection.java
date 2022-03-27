import java.util.*;
class ArrylistNum_Collection{
    public static void main(String args[]){
        ArrayList <Integer> num=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many Elements ");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
            
        }
       System.out.println(" Elements are ");  
       for(Integer u:num){
        System.out.println(u);    
       }
    }
}