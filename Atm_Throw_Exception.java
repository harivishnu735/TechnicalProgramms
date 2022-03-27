import java.util.*;
class AtmOperation{
    int wcount=1;
    double bal=1500;
    Scanner sc=new Scanner(System.in);
    //create method deposit
    public void deposit(){
    System.out.println("Enter Deposit amt :");
    int amt=sc.nextInt();
    bal=bal+amt;
    System.out.println("Available bal :"+bal);
    }
    //create method called withdraw
    public void withdraw(){
    System.out.println("Enter Withdraw amt :");
    int amt = sc.nextInt();
    bal=bal-amt;
    System.out.println("Available bal :"+bal);
    }
    public void balenquiry(){
    System.out.println("Available bal :"+bal);
    }
    // display list of options such as 1. deposit 2. withdraw 3. balance enquiry 0. EXIT
    public void viewOptions(){
    System.out.println("1.Deposit");
    System.out.println("2.Withdraw");
    System.out.println("3.bal enquiry ");
    System.out.println("0.exit");
    // Accept option from user
    System.out.println("Enter Your Option ");
    int option=sc.nextInt();
    switch(option){
    case 1:{
    deposit();
    viewOptions();
    break;
    }
    case 2:{
     viewOptions();
    if(wcount<=3){
    withdraw();
    viewOptions();
    }
    else{
    //throw arithematicException
    throw new ArithmeticException("Your Withdraw limit is over");
    }
    break;
    }
    case 3:{
    balenquiry();
    viewOptions();
    break;
    }
    case 0:{
    System.out.println("Thank you visit again");
    }
    default:{
    System.out.println("Invalid Option");
    }
    }
    
    }
}
class Atm_Throw_Exception{
    public static void main(String args[]){
        AtmOperation obj=new AtmOperation();
        obj.viewOptions();
    }
}