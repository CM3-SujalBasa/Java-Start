import java.io.*;
import java.util.*;
/*
Initial Balance = ₹25,000

Menu

1 Deposit
2 Withdraw
3 Balance
4 Mini Statement
5 Exit

Rules:

Cannot withdraw negative money.
Cannot withdraw more than balance.
Deposit must be positive.

Print every transaction.
*/
class atm{
    public static int bal=25000;
    public static int acc=101;
    public static Scanner sc=new Scanner(System.in);
    public static String accno;

    public static void main(String[] args){
        System.out.print("Enter the account no:");
        accno= sc.nextLine();
        System.out.print("1 Deposit\r\n" + //
                        "2 Withdraw\r\n" + //
                        "3 Balance\r\n" + //
                        "4 Mini Statement\r\n" + //
                        "5 Exit\r\n");
        System.out.print("Enter the option: ");
        int i=sc.nextInt();
        bal1(i);
    }
    public static void bal1(int i1) {
        int j=0;
        switch (i1) {
            case 1:
                System.out.print("Enter the amount to deposit:");
                j=sc.nextInt();
                if (j>0) {
                    bal+=j;
                    System.out.print("The total amount = "+bal);
                }else{
                    System.out.print("Enter amount greater than 0!!!");
                }
                break;
            case 2:
                System.out.print("Enter the amount to withdraw:");
                j=sc.nextInt();
                if (j<=bal) {
                    bal-=j;   
                    System.out.print("The total amount = "+bal);
                }else if(j>0){
                    System.out.print("Enter amount greater than 0!!!");
                }
                else{
                    System.out.print("The amount is insufficient!!!");
                }
                break;
            case 3:
                System.out.print("The total amount = "+bal);
                break;
            case 4:
                System.out.print("Account No = "+accno);
                System.out.print("The total amount = "+bal);
                break;
            case 5:
                System.out.print("\nThank You!!! \n See You Soon!!!");
                break;
            default:
                System.out.print("\n Please enter only (1-5) options!!!");
                break;
        }
    }
}