import java.util.Scanner;
class PrimeNumbers{
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println(n+" It is a prime number :");
        }
        else{
             System.out.println(n+" It is not a prime number :");
        }
    }
}