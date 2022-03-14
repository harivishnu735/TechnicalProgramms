class Student
{
    String name;
    int rollno;
    String section;
    String adress;
    
}
class Exam extends Student
{

  float internal;
  float external;

}
class Project extends Exam
{

    float project;
}
class StudentmarksInInheritance{
    public static void main(String args[]){
    Project result=new Project();
    result.name="Hari";
    result.rollno=3454;
    result.section="A";
    result.adress="Eluru";
    System.out.println("Name :"+result.name+"\nRoll No :"+result.rollno+"\nSection :"+result.section+"\nAdress :"+result.adress);
    result.internal=85;
    result.external=78;
    result.project=80;
    float total=(result.internal+result.external+result.project);
    System.out.println("Total Marks :" +total);
    float percentage=(total/300)*100;
    System.out.println("Percentage is :" +percentage);
    
      if(percentage>=80 && percentage<=95)
    {
       System.out.println("Grade A"); 
    } 
    else if(percentage>=65 && percentage<=80)
    {
        System.out.println("Grade B"); 
    }
    else if(percentage>=45 && percentage<=65)
    {
        System.out.println("Grade C"); 
    }
    else
    {
        System.out.println(" Failed "); 
    }
    }
    
}