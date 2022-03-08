import java.util.*;
class Week{
public static void main(String args[]){
int day;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Day :");
day=sc.nextInt();
if(day<=1){
System.out.println(day+"  It is Monday ");
}
else if(day<=2) {
System.out.println(day+"  It is Tuesday ");
}
else if(day<=3) {
System.out.println(day+"  It is Wednsday ");
}
else if(day<=4) {
System.out.println(day+"  It is Thursday ");
}
else if(day<=5) {
System.out.println(day+"  It is Friday ");
}
else if(day<=6) {
System.out.println(day+"  It is Saturday ");
}
else if(day<=7) {
System.out.println(day+"  It is Sunday ");
}
else
{
System.out.println("it is invalid");
}
}
}