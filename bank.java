import java.io.*;
import java.util.*;
/*
1 Deposit
2 Withdraw
3 Check Balance
4 Exit

Initial Balance = ₹10,000
*/
class bank{
    static int acc=10000; // this is the global variable
    static Scanner sc=new Scanner(System.in);
    //account no = A0111
    public static void main(String[] args){
        System.out.print("Enter the name: ");
        String name= sc.nextLine();
        System.out.print("Enter the account no: ");
        String acc=sc.nextLine();
        b1(acc);
    }
    public static void b1 (String acc1) {   
        if (acc1.equals("A0111")) {
            int ch;
                do{
                    System.out.print("Enter the choice: ");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                                System.out.print("Enter the amount to deposite: ");
                                int d=sc.nextInt();
                                if (d>=0) {
                                            System.out.print("Total amount: "+(acc+=d));
                                        }else{
                                            System.out.print("The amount is negative!!!");
                                }
                                break;
                        case 2:
                                System.out.print("Enter the amount to withdraw: ");
                                int w=sc.nextInt();
                                if (w>=0) {
                                        if (w>acc) {
                                            System.out.print("The withdraw amount is more than balance!!!");  
                                        }else{
                                            System.out.print("Total amount: "+(acc-=w));
                                        }    
                                }else{
                                    System.out.print("The amount is negative!!!");
                                }
                                
                                break;
                        case 3:
                                System.out.print("Total amount: "+(acc));
                                break;
                        case 4:
                                System.out.print("Exit!!!");
                                break;
                        default:
                                System.out.print("Please enter the correct option!!!");
                                break;
                    } 
                    System.out.println();
                }while(ch!=4);
            }
                else{
                    System.out.print("The account doesnot exists!!!");
                }
        }
}