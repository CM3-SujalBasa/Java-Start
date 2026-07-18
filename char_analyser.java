import java.io.*;
import java.util.*;
/*
Input one character.

Determine whether it is:

Uppercase
Lowercase
Digit
Special Symbol
Vowel
Consonant

(Hint: Use ASCII values.)
*/
class char_analyser{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the charater(only one charater): ");
        int no= sc.next().charAt(0);
        boolean f=false;
        System.out.print((no>=65 && no<=90)? (char)(no)+" Uppercase character":"");
        System.out.print((no>=97 && no<=122)? (char)(no)+" Lowercase character":"");
        System.out.print((no>=32 && no<=47) || (no>=58 && no<=64) || (no>=91 && no<=96) || (no>=123 && no<=127 || no==0 || no==9 || no==10 || no==13 || no==27)? "\n"+(char)(no)+" Special character (Symbols)":"");
        System.out.print((no>=48 && no<=57)? (char)(no)+" Digits":"");
        int arr[]={65,69,73,79,85,97,101,105,111,117};

        for (int j : arr) {
            if (j==no) {
                f=true;
                break;
            }
        }
        if ((no>=65 && no<=90) || (no>=97 && no<=122)){
            if (f) {
                System.out.print("\n"+(char)no+" is a vowel");
            }
            else{
                System.out.print("\n"+(char)no+" is a Consonant");
            }
        }
    }
}