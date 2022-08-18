import java.io.*;
class WritingFile{
  public static void main(String args[])
  {
    try
      {
  
    FileWriter filewrite=new FileWriter("Abc.txt");
    BufferedWriter buffer=new BufferedWriter(filewrite);
        
   
      buffer.write("Hari is a good boy");
    //  buffer.write(49);
     
      buffer.close();
      System.out.println("Buffered write start writing");
      
      }
      catch(Exception e){
        System.out.println(e);
      }
  }
}