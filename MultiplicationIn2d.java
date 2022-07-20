import java.util.*;
class MultiplicationIn2d{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter Matrics1 Row size :");
    int row=sc.nextInt();
    System.out.print("Enter  Matrics1 Coloumn size :");
    int col=sc.nextInt();
    System.out.print("Enter  Matrics2 Row size :");
    int row1=sc.nextInt();
    System.out.print("Enter  Matrics2 Coloumn size :");
    int col1=sc.nextInt();
    int a[][]=new int [row][col];
    System.out.println("Enter the First Array Elements:");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
      a[i][j]=sc.nextInt();
      }
    }
    int b[][]=new int [row1][col1];
    System.out.println("Enter the Second Array Elements:");
    for(int i=0;i<row1;i++){
      for(int j=0;j<col1;j++){
      b[i][j]=sc.nextInt();
      }
    }
    int c[][]=new int[row][col];
    
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        for(int k=0;k<row1;k++){
      c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
     
      }
      
    }
    System.out.println"Multiplication of Two Array Elements is:");
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
     System.out.print(c[i][j]+"\t");
      }
      System.out.println();
    }
  }
}