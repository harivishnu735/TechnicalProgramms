import java.util.*;
class SubtractionIn2d{
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
    int b[][]=new int [row][col];
    System.out.println("Enter the Second Array Elements:");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
      b[i][j]=sc.nextInt();
      }
    }
    int c[][]=new int[row][col];
    System.out.println("Sum of Two Array Elements is:");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
      c[i][j]=a[i][j]-b[i][j];
      System.out.print(c[i][j]+"\t");
      }
      System.out.println();
    }
  }
}