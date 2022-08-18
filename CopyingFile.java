 import java.io.*;
class CopyingFile{
  public static void main(String args[])
  {
    try
      {
    FileReader file=new FileReader("Sample.txt");
    FileWriter filewrite=new FileWriter("Hari.txt");
    BufferedWriter buffer=new BufferedWriter(filewrite);
        
    int i;
    while((i=file.read())!=-1)
      buffer.write(i);

      file.close();
      buffer.close();
      System.out.println("Buffered write start writing");
      
      }
      catch(Exception e){
        System.out.println(e);
      }
  }
}