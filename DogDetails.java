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

    
}
class DogDetails{
    public static void main(String args[]){
    Dog dg1 = new Dog();
    dg1.name="Puppy";
    dg.bread="Abcd";
    dg1.color=" White";
    dg1.eyecolor= " Brown ";

    System.out.println("******Dog 1 Details*******");  
    System.out.println("Name :"+dg1.name+"\n"+"Color :"+dg1.color+"\n"+"Eye color :"+dg1.eyecolor+"\n"+"Bread :"+dg1.bread);
    dg1.barking();
    dg1.eating();
    
    Dog dg2 = new Dog();
    dg2.name="rosey";
    dg2.bread="efgh";
    dg2.color=" black";
    dg2.eyecolor= " Blue ";

    System.out.println("******Dog 2 Details*******");  
    System.out.println("Name :"+dg2.name+"\n"+"Color :"+dg2.color+"\n"+"Eye color :"+dg2.eyecolor+"\n"+"Bread :"+dg2.bread);
    dg2.barking();
    dg2.eating();
    }
}