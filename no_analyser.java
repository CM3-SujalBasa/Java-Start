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
        
        if (no==0) {
            System.out.print(no+" is equal to zero");
        }else{
            String s = (no>0)?  ((no%2==0)? no+" +ve Even" : no+" +ve Odd") : ((no%2==0)? no+" -ve Even" : no+" -ve Odd"));
        }

        System.out.print(((no%5==0)&&(no%11==0))? " is divisible by 5 and 11": "is not divisible by 5 and 11");

        f1(no); //to find the no of digits
    }
    public static void f1(int n) {
        int cc=0;
        while (n>0) {
            n=n%10;
            cc+=1;
            n/=10;
        }
        System.out.print(n+" is a"+cc+" digit no");
    }
}