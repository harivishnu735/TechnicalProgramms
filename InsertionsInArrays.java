import java.util.Scanner;
public class InsertionsInArrays {

 Scanner s=new Scanner(System.in);
int arr[]=new int[100];
int n=0;

 public void display(){
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}
public void viewOptions(){
int option=0;
do{
System.out.println("\n1. Insert first");
System.out.println("2. Insert last");
System.out.println("3. Insert specific index");
System.out.println("4. Delete first");
System.out.println("5. Delete last");
System.out.println("6. Delete Serach");
System.out.println("7. Delete element in specific index");
System.out.println("choose your option");
option=s.nextInt();
if(option==1){
System.out.println("Enter your value: ");
if(n==0){
arr[n]=s.nextInt();
n++;
}
else{
for(int i=n;i>0;i--){
arr[i]=arr[i-1];
}
arr[0]=s.nextInt();
n++;
}
display();
}
else if(option==2){
System.out.println("Enter your value: ");
arr[n]=s.nextInt();
n++;
display();
}
else if(option==3){
System.out.println("Enter index position");
int index=s.nextInt();
System.out.println("Enter your value");
if(index<=n){

 for(int i=n;i>index;i--){
arr[i]=arr[i-1];
}
arr[index]=s.nextInt();
n++;
display();
}
else{
System.out.println("Invalid index position");
}
}
else if(option==4){
for(int i=0;i<n;i++){
arr[i]=arr[i+1];
}
n--;
display();
}
else if(option==5){
n--;
display();
}
else if(option==6){
System.out.println("Delete element in specific index");
int sindex=s.nextInt();
System.out.println("Enter your value");
 for(int i=n;i>sindex;i--){
arr[i]=arr[i-1];
}
arr[sindex]=s.nextInt();
n--;
display();
}
else{
System.out.println("Invalid index position");
}

}
while(option!=0);
}



public static void main(String[] args) {

InsertionsInArrays obj=new InsertionsInArrays();
obj.viewOptions();

}
} 