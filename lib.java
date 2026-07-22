import java.io.*;
import java.util.*;
/*
Create a menu:

1. Borrow Book
2. Return Book
3. Check Fine
4. Exit

Input:

Student Name
Number of late days

Fine:

0–5 days      ₹0
6–10 days     ₹50
11–20 days    ₹100
Above 20      ₹200

Use switch + if.    
*/
class lib{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Student name: ");
        String sname= sc.nextLine();
        System.out.print("\n1. Borrow Book\r\n" + //
                        "2. Return Book\r\n" + //
                        "3. Check Fine\r\n" + //
                        "4. Exit "+"\nEnter the choice:");
        int ch= sc.nextInt();
        int d;
        switch (ch) {
            case 1:
                System.out.println();
                System.out.println(sname.toUpperCase()+": \n");
                System.out.print("\n Book Borrowed!!!");
                break;
            case 2:
                System.out.println();
                System.out.println(sname.toUpperCase()+": \n");
                System.out.print("Enter the return day(from the day of borrow): ");
                d= sc.nextInt();
                if (d>=0) {
                    System.out.print("The total amount = ₹"+f1(d));
                }else{
                    System.out.print("Please enter the positive no(days)");
                }
                break;
            case 3:
                System.out.println();
                System.out.println(sname.toUpperCase()+": \n");
                System.out.print("Enter the total days from borrow: ");
                d= sc.nextInt();
                if (d>=0) {
                    System.out.print("The total amount = ₹"+f1(d));
                }else{
                    System.out.print("Please enter the positive no(days)");
                }
                break;
            case 4:
                    System.out.print("Thank you!!!");
                break;
            default:
                System.out.print("Enter valid choice from (1-3)!!!s");
                break;
        }
    }
    public static int f1(int d1){

        if(d1>=0 && d1<=5){
            return 0;
        }else if (d1<=10) {
            return 50;
        }else if (d1<=20) {
            return 100;
        }else if (d1>20) {
            return 200;
        }
        return -1;
    }
}