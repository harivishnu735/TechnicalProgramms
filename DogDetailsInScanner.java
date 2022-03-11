import java.util.*;
class Dog{
    String name;
    String color;
    String bread;
    String eyecolor;
    
    void barking()
    {
        System.out.println(name+" Is Barking ");
    }
    void eating()
    {
        System.out.println(name+ " Is eating  ");
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Dog Name ");
        name=sc.next(); 
        System.out.println("Enter the Colour ");
        color=sc.next();
        System.out.println("Enter the Bread ");
        bread=sc.next();
        System.out.println("Enter the Eyecolor ");
        eyecolor=sc.next(); 
    }
    void show()
    {
        System.out.println("Name :"+name+"\n"+"Color :"+color+"\n"+"Eye color :"+eyecolor+"\n"+"Bread :"+bread); 
    }
    
}
class DogDetailsInScanner{
    public static void main(String args[]){
    Dog dg1 = new Dog();
    dg1.input();
    dg1.barking();
    dg1.eating();
    dg1.show();
    
     Dog dg2 = new Dog();
     dg2.input();
     dg2.barking();
     dg2.eating();
     dg2.show();
    }
}