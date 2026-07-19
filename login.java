import java.io.*;
import java.util.*;
/*
Correct credentials:

Username : admin
Password : java123

Rules:

Username is case-sensitive.
Password must match exactly.
Print:
Login Successful
Wrong Password
User Not Found

(Hint: Use String.equals() for comparing strings.)
*/
class login{
    static String us= "admin";
    static String pass = "java123";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the username: ");
        String us1= sc.nextLine();
        System.out.print("Enter the password: ");
        String pass1= sc.nextLine();
        int f1=0;

        if(!us.equals(us1)){
            f1+=1;
            System.out.println("The user is not vaild!!!");
            return;
        }if(!pass.equals(pass1)) {
            f1+=1;
            System.out.print("The passward is incorrect!!!");
            return;
        }if(f1!=2){
            System.out.print("Login Succwssfully!!!");
        }
    }
}