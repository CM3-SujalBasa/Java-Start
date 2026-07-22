import java.io.*;
import java.util.*;
/*
Take input:

Employee Name
Employee ID
Basic Salary

Calculate:

HRA = 20% of Basic
DA = 10% of Basic
PF = 12% of Basic

Then calculate:

Gross Salary
Net Salary

Rules:

If Basic Salary > ₹50,000
Bonus = ₹5,000
Else
Bonus = ₹2,000

Print a professional salary slip.

Concepts Tested:

Scanner
Variables
Arithmetic
if-else
*/
class payroll{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Employee name: ");
        String ename= sc.nextLine();
        System.out.print("Enter the Employee id: ");
        int eid= sc.nextInt();
        System.out.print("Enter the Basic Salary: ");
        double sal= sc.nextLong();
        double hra = (double)((20.00/100.00)*sal);
        System.out.println("HRA = "+hra);
        double da= (double)(10.00/100.00)*sal;
        System.out.println("DA = "+da);
        double pf=(double)(12.00/100.00)*sal;
        System.out.println("Pf = "+pf);
        double b=(sal>50000)? 5000:2000;
        System.out.println("Bonous = "+b);

        System.out.println("The Gross sal is = "+(double)(sal+hra+da+b));
        System.out.println("The Net sal is = "+(double)((sal+hra+da+b)-pf));
    }
}