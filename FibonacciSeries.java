import java.util.Scanner;
class FibonacciSeries{
    public static void main(String args[]){
    int maxnum=0;
    int prevnum=0;
    int nextnum=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter How many you  want ");
     maxnum=sc.nextInt();
      for(int i=1;i<=maxnum;i++){
       System.out.print(prevnum+"  ");
       int sum=prevnum+nextnum;
       prevnum=nextnum;
       nextnum=sum;
        }
    }
}