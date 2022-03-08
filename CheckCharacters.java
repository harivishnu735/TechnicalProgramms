import java.util.*;
class CheckCharacters{
public static void main(String args[]){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The character:");
ch=sc.next().charAt(0);
if(ch>'A'&&ch<'Z'){
System.out.println(ch+"  It is a Alphabet ");
}
else if(ch>'a'&&ch<'z')
{
System.out.println(ch+"   It is a Lower case");
}
else if(ch>'0'&&ch<'9')
{
System.out.println(ch+"  It is a Digit ");
}
else{
System.out.println("It is a Special character");    
}
}
}