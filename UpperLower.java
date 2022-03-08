import java.util.*;
class UpperLower{
public static void main(String args[]){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The character:");
ch=sc.next().charAt(0);
if(ch>'A'&&ch<'Z'){
System.out.println(ch+"  It is a UpperCase ");
}
else if(ch>'a' &&ch<'z')
{
System.out.println(ch+"  It is a Lower case");
}
else{
System.out.println("it is not valid ");    
}
}
}