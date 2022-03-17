interface Animal
{
    void eat();
}
class Cat implements Animal
{
    public void eat()
    {
        System.out.println("The Cat is drinking the milk...! ");
    }
}
class Dog implements Animal
{
     public void eat()
    {
        System.out.println("The Dog is Running...! ");
    }
}

class Animal_Interface
{
    public static void main(String args[])
    {
        Cat c=new Cat();
        c.eat();
        
        Dog d=new Dog();
        d.eat();
    }
}