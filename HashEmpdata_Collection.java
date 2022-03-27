/* Create an application having a Generic HashMap with Empcode as key and EmpName as value. Display only EmpNames as output. 
Prompt the user input from the terminal.
Sample Input: 
Enter Emp code:101
Enter Emp Name: Ram
Enter another student (y/n)?y
Enter Emp code:102
Enter Emp Name: Vaibhav
Enter another student (y/n)?y
Enter Emp code:103
Enter Emp Name: Priyanka
Enter another student (y/n)?n
Expected Output: 
Ram
Vaibhav
Priyanka */

import java.util.*;
class HashEmpdata_Collection{
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap();
        boolean val=true;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter Emp Code ");
            Integer ecode=Integer.parseInt(sc.nextLine());
             System.out.print("Enter Emp Name ");
             String ename=sc.nextLine();
             
             String edata=hm.put(ecode,ename);
             if(edata!=null){
             System.out.println("Empcode"+ecode+"is"+edata+"and has over written by"+ename);
        
             }
             System.out.println("Enter Another Student (Y/N)?");
             String choice=sc.nextLine();
             if(choice.equals("y")){
                 continue;
             }
             else{
                 break;
             }
        }
        while(val);
        System.out.println("Employee Names");
        for(int emp:hm.keySet()){
            
            System.out.println(hm.get(emp));
        }
    }
}
