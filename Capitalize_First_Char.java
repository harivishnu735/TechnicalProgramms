class Capitalize_First_Char{
  public static void main(String args[]){
    String str="hari is a good boy";
    String words[]=str.split(" ");
    String newword="";
    for(String w:words){
    String first=w.substring(0,1);
    String reset=w.substring(1);
      System.out.println(first+"  "+ reset);
      newword+=first.toUpperCase()+reset+" ";
    }
    
    System.out.println(newword.trim());
  }
}