import java.util.*;
class Occurance{
  public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    str=str.replaceAll("\\s+"," ");
    String c[]=str.split(" ");
    String b="\0";
    
   for(int i=0;i<c.length;i++){
     int count=1;
     for(int j=i+1;j<c.length;j++){
        if(c[i].equalsIgnoreCase(c[j])){
         count++;
         c[j]=b;
       }
     }
       if(c[i]!=b){
     System.out.println(c[i].toUpperCase()+" Frequency :"+count);
       }    
   }
  
  }
}