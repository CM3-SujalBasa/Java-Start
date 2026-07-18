import java.io.*;
import java.util.*;
/*
Input one integer.

Print whether it is:

Positive/Negative/Zero
Even/Odd
Divisible by both 5 and 11
Two-digit / Three-digit / More than three digits
*/
class no_analyser{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no: ");
        int no= sc.nextInt();
        String s="";
        if (no==0) {
            System.out.print(no+" is equal to zero");
        }else{
            s = (no>0)?  ((no%2==0)? no+" +ve Even" : no+" +ve Odd") : ((no%2==0)? no+" -ve Even" : no+" -ve Odd");
        }
        System.out.println(s);

        System.out.println(((no%5==0)&&(no%11==0))? no+" is divisible by 5 and 11": no+"is not divisible by 5 and 11");

        f1(no); //to find the no of digits
    }
    public static void f1(int n) {
        int r=0,cc=0,n1=Math.abs(n);
        if (n1==0) {
            System.out.println(n1+" is a 1 digit no");
        }else{
            while (n1>0) {
                // r=n1%10; // here this step can be not used bcz here we dont want the remainder means the last digit
                cc+=1;
                n1/=10;
            }
        }
        System.out.print(n+" is a "+cc+" digit no");
    }
}