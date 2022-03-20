//Method---Final..we cannot change the Method once it Final..!
class Student{
    final int rollno=4567;
    final String name="Hari";
    final void read()
    {
        System.out.println("Reading book ");
    }
}
class Topper extends Student{
    void write()
    {
       System.out.println("Writing The book ");  
    }
    
}
class Student_Final_Method{
    public static void main(String args[]){
        Student st=new Student();

        System.out.println("Roll No :"+st.rollno+"\nName :"+st.name);
        st.read();
    
    }
}