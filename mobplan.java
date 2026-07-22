import java.io.*;
import java.util.*;
/*
3. Mobile Recharge System ⭐⭐⭐⭐

Plans:

1 → ₹199
2 → ₹299
3 → ₹499
4 → ₹799

Input:

Mobile Number
Plan Number

Apply discount:

Above ₹500
10% Discount

Print final bill.   
*/
class mobplan{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String p1="^[0-9]{10}$";
        System.out.print("Enter the mobile no:");
        String sname= sc.nextLine();
        if (sname.matches(p1)) {
            System.out.print("Enter the mobile no:  \n1 -> ₹199\r\n" + //
                            "2 -> ₹299\r\n" + //
                            "3 -> ₹499\r\n" + //
                            "4 -> ₹799\r\n"+
                            "5 -> Exit\n");
            int i=sc.nextInt();
            plan(i);
        }else{
            System.out.print("Invalid mobile no!!!\n");
            plan(5);
        }
    }
    public static void plan(int i1){
        if (i1==1 || i1==2 || i1==3 || i1==4) {
            System.out.print("The cost of the plan is= ₹");   
        }
        switch (i1) {
            case 1:
                System.out.print("Plan Prize: 199");
                System.out.print("discount: 0");
                System.out.print("Final Bill: 199");
                break;
            case 2:
                System.out.print("Plan Prize: 299");
                System.out.print("discount: 0");
                System.out.print("Final Bill: 299");
                break;
            case 3:
                System.out.print("Plan Prize: 499");
                System.out.print("discount: 0");
                System.out.print("Final Bill: 499");
                break;
            case 4:
                System.out.print("Plan Prize: 799");
                System.out.print("discount: "+((10.00/100.00)*799));
                System.out.print("Final Bill:"+((double)799-((10.00/100.00)*799)));
                break;
            case 5:
                System.out.print("Thank You!!!");
                break;
            default:
                System.out.print("Please enter (1-5) options only!!!");
                break;
        }
    }
}