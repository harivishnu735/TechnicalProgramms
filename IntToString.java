/*  JFM1T8_Assignment1:

    Write a program to convert an int variable to String using an inbuilt function of String class and print the char at index position 2.
    Prompt the user input from the terminal.
    
    Sample input: 54321
    
    Expected output: char at index position 2 = 3
*/

import java.util.Scanner;

public class IntToString {
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("numbers");
        i=sc.nextInt();
        String s=Integer.toString(i);
        char firstcharacter=s.charAt(2);
        System.out.println("char at index position 2="+(firstcharacter));
    }

//main method

//declare int type variable

//take input from user

//converting integer to string using toString method

//use inbuilt function to print index position

//print result

}