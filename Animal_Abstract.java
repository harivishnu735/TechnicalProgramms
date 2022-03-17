abstract class Animal
{
    String name;
    String color;
    abstract void run();
  
}
class Horse extends Animal{
    void run()
    {
        System.out.println("The Horse is Running Fast....! ");
    }
}
class Tortoise extends Animal{
    void run()
    {
        System.out.println("The Tortoise Is Running Slowly....! ");
    }
}

class Animal_Abstract
{
    public static void main(String args[])
    {
        Horse h=new Horse();
        h.name="Horse";
        h.color="Black";
        System.out.println(h.name+" Is Eating Some Food ..! ");
        System.out.println("Colour Is :"+h.color);
        h.run();
        
         System.out.println();
         
        Tortoise tr=new Tortoise();
        tr.name="Tortoise";
        tr.color="White";
        System.out.println(tr.name+" Is Eating Some Food ..! ");
        System.out.println("Colour Is :"+tr.color);
        tr.run();
    }
}