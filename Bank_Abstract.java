abstract class Bank 
{
    abstract void rateof_intrest();
}
class Sbi extends Bank
{
    void rateof_intrest()
    {
        System.out.println("The Rate Of Intrest Of SBI Is 6 % ");
    }
}
class Union extends Bank
{
     void rateof_intrest()
    {
        System.out.println("The Rate Of Intrest Of UNION Is 4 % ");
    }
}
class Axis extends Bank
{
     void rateof_intrest()
    {
        System.out.println("The Rate Of Intrest Of AXIS Is 8 % ");
    }
}

class Bank_Abstract
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