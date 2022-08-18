import java.io.*;
class ReadingFile{
  public static void main(String args[])throws Exception
  {
    FileReader file=new FileReader("Sample.txt");
    FileReader file2=new FileReader("Simple.txt");
    
    int i;
    while((i=file.read())!=-1)
      System.out.print((char)i);
  }
}