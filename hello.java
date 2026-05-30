import java.util.*;
/*
Print "Hello World".
Print your name, age, and city.
Take user input and print it.
*/
class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hello World");
        System.out.println();
        System.out.print("Enter the name:");
        String s = sc.next();
        System.out.print("Enter the age:");
        int age= sc.nextInt();
        System.out.print("Enter the city:");
        String city = sc.next();
        System.out.println();
        System.out.print("The name is: "+s+"\n"+"The age ="+age+"\n"+"The city is "+city);
    }
}