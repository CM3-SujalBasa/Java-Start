import java.io.*;
import java.util.*;
/*
Take input:
Name
Roll No
Marks of 5 subjects

90–100  A+
80–89   A
70–79   B
60–69   C
50–59   D
Below 50  Fail
*/
class stud_report{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name:");
        String n=sc.nextLine();
        System.out.print("Enter the rollno:");
        int r=sc.nextInt();
        int a[]=new int[5];
        System.out.println("Enter the 5 subject marks(each subject is of 20 marks): ");
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.print("Enter ["+i+"] subject:");
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        double per =((double)sum/100)*100;
        f1(per);
    }
    public static void f1(double per1){
        if(per1>=90){
            System.out.println(per1+" is A+ grade");
        }else if (per1>=80) {
            System.out.println(per1+" is A grade");
        }else if (per1>=70) {
            System.out.println(per1+" is B grade");
        }else if (per1>=60) {
            System.out.println(per1+" is C grade");
        }else if (per1>=50) {
            System.out.println(per1+" is D grade");
        }else{
            System.out.println(per1+" is Fail grade");
        }
    }
}