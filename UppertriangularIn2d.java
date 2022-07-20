import java.util.*;
class UppertriangularIn2d{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter Row size :");
    int row=sc.nextInt();
    System.out.print("Enter Coloumn size :");
    int col=sc.nextInt();
    int a[][]=new int [row][col];
    System.out.println("Enter the First Array Elements:");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
      a[i][j]=sc.nextInt();
      }
    }
    
    System.out.println(" Array Elements are:");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
      System.out.print(a[i][j]+"\t");
      }
      System.out.println();
    }
    
    System.out.println("Upper triangular Array Elements are:");
    for(int i=0;i<col;i++){
      for(int j=0;j<row;j++){
        if(i>j){
          System.out.print("0"+" ");
        }
        else
      System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }
  }
}