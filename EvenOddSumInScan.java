import java.util.*;
class EvenOddSumInScan{
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  System.out.println("Enter Array Size");
  int n=sc.nextInt();
  System.out.println("Enter "+n+" Values:");
    int arr[]=new int[n];
    int esum=0,osum=0;
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        esum=esum+arr[i];
    
      }
      else{
        osum=osum+arr[i];
      }
    
    }
    System.out.println("Even Numbers Sum:"+esum);
    System.out.println("Odd Numbers Sum:"+osum);
  }
}