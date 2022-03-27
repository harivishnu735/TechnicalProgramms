class Throw_Exception{
    public static void admission(int age){
        if(age>18){
            System.out.println(" eligible");
        }
        else{
            throw new ArithmeticException("Not Eligible ");
        }
    }
    public static void main(String args[]){
        try  {
           admission(17); 
        } catch(Exception e) 
        {
         System.out.println(e);
        } 
        finally {
        }
    }
}