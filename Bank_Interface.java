interface Bank 
{
     void rateof_intrest();
}
class Sbi implements Bank
{
   public  void rateof_intrest()
    {
        System.out.println("The Rate Of Intrest Of SBI Is 6 % ");
    }
}
class Union implements Bank
{
    public void rateof_intrest()
    {
        System.out.println("The Rate Of Intrest Of UNION Is 4 % ");
    }
}
class Axis implements Bank
{
    public void rateof_intrest()
    {
        System.out.println("The Rate Of Intrest Of AXIS Is 8 % ");
    }
}

class Bank_Interface
{
    public static void main(String args[])
    {
     Bank s=new Sbi();
     s.rateof_intrest();
     
     Bank u=new Union();
     u.rateof_intrest();
     
     Bank a=new Axis();
     a.rateof_intrest();
    }
}