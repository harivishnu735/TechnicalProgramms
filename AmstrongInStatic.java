class Amstrongnum{
    static void Amstrong(){
      int n=371;
      int rem,sum=0,temp=n;
      while(n!=0)
      {
          rem=n%10;
          sum=sum+(rem*rem*rem);
          n=n/10;
      }
      if(temp==sum)
      {
       System.out.println(temp+" It is Amstrong ");   
      }
      else
      {
       System.out.println(temp+" It is not a Amstrong ");     
      }
       
    }
}
class AmstrongInStatic{
    public static void main(String args[])
    {
    Amstrongnum.Amstrong();    
   
    }
}