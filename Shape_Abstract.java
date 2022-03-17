//Abstract Concept...!

abstract class Shape 
{
    abstract void Draw();
}
class Circle extends Shape
{
    void Draw()
    {
        System.out.println("This Is Circle....! ");
    }
}
class Rectangle extends Shape
{
     void Draw()
    {
        System.out.println("This Is Rectangle...! ");
    }
}
class Traingle extends Shape
{
     void Draw()
    {
        System.out.println("This Is Traingle...! ");
    }
}

class Shape_Abstract
{
    public static void main(String args[])
    {
     Shape c=new Circle();
     c.Draw();
     
     Shape r=new Rectangle();
     r.Draw();
     
     Shape t=new Traingle();
     t.Draw();
    }
}