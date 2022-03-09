import java.util.Scanner;
class CharacterValues{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch=sc.next().charAt(0);
       int s=ch;
       char c=(char)ch;
        System.out.println("The ASCII Value of "+ch+"  is  "+s);
         System.out.println(ch);
    } 
}