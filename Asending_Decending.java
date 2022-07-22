import java.util.*;
public class Asending_Decending
{
	public static void main(String[] args)
	{
		int i,j,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for ( i = 0; i < n; i++)
		{
		   arr[i]=sc.nextInt();
		}
	    
		for (i =0; i <arr.length; i++)
		{
		   for( j=i+1;j<arr.length;j++)
		   {
		       if(arr[i]>arr[j]){
		       temp=arr[i];
		       arr[i]=arr[j];
		       arr[j]=temp;
		       }
		       
		   }
		}
		System.out.println("Increasing Order ");
		for( j=0;j<arr.length;j++)
		{
		    System.out.println(arr[j] +" ");
		    
		}
		for ( i =0; i <arr.length; i++)
		{
		   for( j=i+1;j<arr.length;j++)
		   {
		       if(arr[i]<arr[j]){
		       temp=arr[i];
		       arr[i]=arr[j];
		       arr[j]=temp;
		       }
		       
		   }
		}
		System.out.println("\nDecreasing Order");
			for( j=0;j<arr.length;j++)
		{
		    System.out.println(arr[j] +" ");
		    
		}
	}
 
}