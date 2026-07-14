import java.util.*;
/*
Find addition, subtraction, multiplication, and division of two numbers.
*/
public class calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no1: ");
        int a=sc.nextInt();
        System.out.println("Enter the no2:");
        int b=sc.nextInt();
        System.out.println("Enter your choice(+,-,*,/):");
        String s = sc.next();
        System.out.println(ccc(a,b,s));
    }
    public static int ccc(int x, int y,String s){
        switch (s) {
            case "+":
                System.out.println("The addition is =");
                return (x+y);
                

            case "-":
                System.out.println("The substraction is =");
                return (x-y);
                
            
            case "*":
                System.out.println("The multition is =");
                return (x*y);
                
            
            case "/":
                if (y==0){
                    System.out.println("Divide by 0 Error!!!");    
                    return 0;
                }
                else{  
                System.out.println("The division is =");
                return (x/y);
                }
            default:
                System.out.println("Please choose correct option!!!");
                return 0;                      
        }
    }
}
