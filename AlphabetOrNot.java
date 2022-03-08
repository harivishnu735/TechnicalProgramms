import java.util.*;
class AlphabetOrNot{
public static void main(String args[]){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The character:");
ch=sc.next().charAt(0);
if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
{
System.out.println("It is a Alphabet ");
}
else{
System.out.println("It is not a Alphabet");
}
}
}