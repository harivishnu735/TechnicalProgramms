import java.util.Scanner;
class TwoDimCount{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter array size");
        n=sc.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter array values");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
       
       
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=20 && a[i][j]<10)
                    count++;
                    break;
               
            }
        }
        System.out.println(count+ "  value are there");
    }
}





