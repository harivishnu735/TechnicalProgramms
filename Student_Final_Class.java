//Class---Final..we cannot change the Class once it is Final..!
final class Student{
    final int rollno=4567;
    final String name="Hari";
    final void read()
    {
        System.out.println("Reading book ");
    }
}

class Student_Final_Class{
    public static void main(String args[]){
        Student st=new Student();
    
        System.out.println("Roll No :"+st.rollno+"\nName :"+st.name);
        st.read();
    
    }
}