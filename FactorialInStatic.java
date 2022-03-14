class Factorial
{
    static void fact(int n)
    {
    
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial is :"+f);
    }
}
class FactorialInStatic{
    public static void main(String args[]){
        Factorial.fact(5);
    }
}