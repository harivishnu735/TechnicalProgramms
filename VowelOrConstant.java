import java.util.*;
class VowelOrConstant{
public static void main(String args[]){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The character:");
ch=sc.next().charAt(0);
if((ch=='A'||ch=='e'||ch=='I' || ch=='O' || ch=='U')||(ch=='a'||ch=='e'||ch=='i' || ch=='o' || ch=='u')){
System.out.println(ch+"  It is a Vowel ");
}
else{
System.out.println(ch+"  It is a constant");
}
}
}