//Varaible---Final..we cannot change the varaible once it Final..!
class Student{
    final int rollno=4567;
    final String name="Hari";
}
class Student_Final_Varaible{
    public static void main(String args[]){
        Student st=new Student();
        //st.name="Vishnu";  ==we cannot assign values once its final.
        System.out.println("Roll No :"+st.rollno+"\nName :"+st.name);
    }
}