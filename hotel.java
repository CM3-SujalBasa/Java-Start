import java.io.*;
import java.util.*;
/*
4. Hotel Billing System ⭐⭐⭐⭐

Input:

Customer Name
Number of Days
Room Type
1 Deluxe = ₹2500/day
2 Super Deluxe = ₹4000/day
3 Suite = ₹6500/day

Extra:

GST = 18%

If stay > 5 days

Apply 15% discount.

Print final bill   
*/
class hotel{
    public static int d;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Customer name:");
        String cname= sc.nextLine();
        System.out.print("Enter the No. of days:");
        d=sc.nextInt();
        if (d>0) {
            System.out.print("\nEnter the Room Type:\r\n" + //
                        "1) Deluxe = ₹2500/day\r\n" + //
                        "2) Super Deluxe = ₹4000/day\r\n" + //
                        "3) Suite = ₹6500/day\r\n"+
                        "4)Exit\r\n");
            int ty=sc.nextInt();
            f11(ty,cname);   
        }else{
            System.out.print("Please enter valid no. of days!!!");
        }
    }
    public static void f11(int ty1,String s) {
        switch (ty1) {
            case 1:
                int r1=2500;
                System.out.print("\n\n Customer Name: "+s);
                System.out.print("\nRoom Type : Deluxe Room");
                double arr[]=bill(r1);
                System.out.print("\nFinal Bill :");
                System.out.print("\nRoom Bill for "+d+" days="+arr[3]+"\nGst: "+arr[1]+"\n Extra Stay: "+arr[2]+"\nTotal Bill = "+arr[0]);
                break;
            case 2:
                int r2=4000;
                System.out.print("\n\n Customer Name: "+s);
                System.out.print("\nRoom Type : Super Deluxe Room");
                double arr1[]=bill(r2);
                System.out.print("\nFinal Bill :");
                System.out.print("\nRoom Bill for "+d+" days="+arr1[3]+"\nGst: "+arr1[1]+"\n Extra Stay: "+arr1[2]+"\nTotal Bill = "+arr1[0]);
                break;
            case 3:
                int r3=6500;
                System.out.print("\n\n Customer Name: "+s);
                System.out.print("\nRoom Type : Suite Room");
                double arr2[]=bill(r3);
                System.out.print("\nFinal Bill :");
                System.out.print("\nRoom Bill for "+d+" days="+arr2[3]+"\nGst: "+arr2[1]+"\n Extra Stay: "+arr2[2]+"\nTotal Bill = "+arr2[0]);
                break;
            case 4:
                System.out.print("\n Thank You!!\n\rVisit Again!!!\r");
                break;
            default:
                System.out.print("\n Please Enter (1 to 4)options only!!!");
                break;
        }
    }
    public static double[] bill(double i) {
        double roomp=d*i;
        double gst=(18.00/100.00)*roomp;
        double extra=(d>5)? ((15.00/100.00)*roomp):(0.0) ;
        return new double[]{(gst+roomp-extra),gst,extra,roomp};
    }
}