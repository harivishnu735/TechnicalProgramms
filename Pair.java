import java.util.*;
class Pair {
  public static void findpair(int[] nums,int n){
    for(int i=0;i<nums.length;i++){
      int sum=0;
      for(int j=i;j<nums.length;j++){
        sum=sum+nums[j];
        if(sum==0){
          System.out.println("SubArray Of ["+i+","+j+"]");
          //return;
        }
          
        }
      }
            
    
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int nums[]=new int[n];
    System.out.println("Enter Numbers into array");
    for(int i=0;i<n;i++)
      nums[i]=sc.nextInt();
    //System.out.println("Enter target vale");
    //int target=sc.nextInt();
    findpair(nums,n);
    
  }
} 

/*import java.util.*;
class Pair {
  public static void findpair(int[] nums,int n,int target){
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(nums[i]+nums[j]==target){
          System.out.println("Found Pair Of ("+nums[i]+","+nums[j]+")");
          return;
        }
        
        }
      }
  
          System.out.println("Not Found Pair");
    
  }
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int nums[]=new int[n];
    System.out.println("Enter Numbers into array");
    for(int i=0;i<n;i++)
      nums[i]=sc.nextInt();
    System.out.println("Enter target vale");
    int target=sc.nextInt();
    findpair(nums,n,target);
  }
} */