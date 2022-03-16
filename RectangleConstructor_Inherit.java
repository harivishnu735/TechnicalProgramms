class Rectangle{
    double length;
    double bredth;
    Rectangle(double length,double bredth)
    {
        this.length=length;
        this.bredth=bredth;
    }
    void area()
    {
      double area;
      area=this.length*this.bredth;
      System.out.println("Area of Rectangle is :"+area);
    }
    void perimeter()
    {
        double perimeter;
        perimeter=2*(this.length+this.bredth);
        System.out.println("The Perimeter Is :"+perimeter);
    }
}
class Square extends Rectangle{
    
    Square(double side)
    {
        
        super(side,side);
    
    }
  
}
class RectangleConstructor_Inherit{
    public static void main(String args[]){
        Square s=new Square(4);
        Rectangle r=new Rectangle(5,5);
        System.out.println("********** Square details ************");
        s.area();
        s.perimeter();
        System.out.println("************** Rectangle details *******************");
        r.area();
        r.perimeter();
    }
}