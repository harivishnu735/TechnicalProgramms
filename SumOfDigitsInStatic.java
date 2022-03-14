class SumOfDigits{
    static void Sum()
    {
        int n=1234;
        int sum=0;
        for(sum=0;n!=0;n/=10)
        {
            sum+=n%10;
        }
        System.out.println(sum);
    }
}
class SumOfDigitsInStatic{
    public static void main(String args[]){
    
    SumOfDigits.Sum();    
    }
}