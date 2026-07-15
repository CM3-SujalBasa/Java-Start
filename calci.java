import java.io.*;
import java.util.*;
class calci{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the v1:");
        int a=sc.nextInt();
        System.out.println("Enter the v2:");
        int b=sc.nextInt();
        System.out.println("Enter the choice(+,-,*,/): ");
        char ch=sc.next().charAt(0);
        System.out.println(a + " " + ch + " " + b + " = " + fun1(a, b, ch));
    }
    public static String fun1(int a1,int b1, char c1){
        switch (c1) {
            case '+': return String.valueOf(a1+b1);
            case '-': return String.valueOf(a1-b1);
            case '*': return String.valueOf(a1*b1);
            case '/': return String.valueOf((b1!=0)? (a1/b1) : "Divide by zero Error!!!" );
            default: return String.valueOf("pleace enter (+,-,*,/) only!!!");
                
        }
    }
}