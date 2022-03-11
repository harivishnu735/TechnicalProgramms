class Student{
    String name;
    int rollno;
    String branch;
    String section;
    long mobile;
    String gender;
    
    void playing()
    {
        System.out.println(name+" Is Playing Sports ");
    }
    void talking()
    {
        System.out.println(name+ " Is Talking to Some one ");
    }
    void reading()
    {
       System.out.println(name+ " Is Reading The Books ");  
    }
    
}
class StudentDetails{
    public static void main(String args[]){
    Student std1 = new Student();
    std1.name="Hari";
    std1.rollno=123;
    std1.branch=" MECH ";
    std1.section= " A ";
    std1.mobile= 9876;
    std1.gender = " MALE ";
    System.out.println("******Student 1 Details*******");  
    System.out.println("Name :"+std1.name+"\n"+"Roll no :"+std1.rollno+"\n"+"Branch :"+std1.branch+"\n"+"Section :"+std1.section+"\n"+"Mobile :"+std1.mobile+"\n"+"Gender :"+std1.gender);
    std1.playing();
    std1.talking();
    std1.reading();
    Student std2 = new Student();
    std2.name="Vishnu";
    std2.rollno=345;
    std2.branch=" Civil ";
    std2.section= " B ";
    std2.mobile= 98766;
    std2.gender = " MALE ";
    System.out.println("******Student 2 Details*******");  
    System.out.println("Name :"+std2.name+"\n"+"Roll no :"+std2.rollno+"\n"+"Branch :"+std2.branch+"\n"+"Section :"+std2.section+"\n"+"Mobile :"+std2.mobile+"\n"+"Gender :"+std2.gender); 
    std2.playing();
    std2.talking();
    std2.reading();
    }
}