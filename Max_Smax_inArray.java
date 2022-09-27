/*  Enter size 
6
Enter array elements
32
45
23
76
36
67
Maximum value is :76
SecondMaximum value is :67 */

import java.util.*;
class Max_Smax_inArray {
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size ");
    int n=sc.nextInt();
    int arr[]=new int [n]; //32 45 23 76 36 67
    int max=0,smax=0,min=0;
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
       if(arr[i]>max){
         smax=max;
         max=arr[i];
       }
       else if(arr[i]>smax){
         min=smax;
         smax=arr[i];
       }
      else if(arr[i]>min){
        min=arr[i];
      }
    }
    System.out.println("Maximum value is :"+max);
    System.out.println("SecondMaximum value is :"+smax);
    System.out.println("Minimum value is :"+min);
  }
  }