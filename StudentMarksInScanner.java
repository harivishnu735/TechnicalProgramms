import java.util.*;
class Student{
    String sname;
    int srollno;
    String s_section;
    int imarks;
    int emarks;
    int pmarks;
    
    void grade()
    {
     float total,percentage;
     total=imarks+emarks+pmarks;
     percentage=(total/300)*100;
     if(percentage<90&&percentage>=80)
     {
         System.out.println(total+": Total marks  ");
         System.out.println(" A Grade  :");

     } 
     else if(percentage<80&&percentage>=70)
     {
         System.out.println(total+": Total marks  ");
         System.out.println(" B Grade  :");
     } 
     else if(percentage<70&&percentage>=60)
     {
       System.out.println(total+": Total marks  ");
       System.out.println(" C Grade  :");  
     }
     else
     {
       
       System.out.println(total+" : Total marks  ");
       System.out.println(" Failed  :");    
     }
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        sname=sc.next();
        System.out.println("Enter the Roll no ");
        srollno=sc.nextInt(); 
        System.out.println("Enter the Section ");
        s_section=sc.next();
        System.out.println("Enter the Internal marks ");
        imarks=sc.nextInt();
        System.out.println("Enter the External marks ");
        emarks=sc.nextInt();
        System.out.println("Enter the Project marks ");
        pmarks=sc.nextInt();
    }
    void display()
    {
        System.out.println("Name :"+sname+"\n"+"Roll no :"+srollno+"\n"+"Section :"+s_section+"\n" + "Internal marks :"+imarks+"\n"+"External Marks :"+emarks+"\n"+"Project Marks :"+pmarks);
    }
   
}
class StudentMarksInScanner{
    public static void main(String args[]){
    Student std1 = new Student();
    std1.input();
    std1.grade();
    std1.display();
    
    Student std2 = new Student();
    std2.input();
    std2.grade();
    std2.display();
    }
}