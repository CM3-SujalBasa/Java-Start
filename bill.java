import java.io.*;
import java.util.*;
/*
0–100      ₹5/unit
101–200    ₹7/unit
201–300    ₹9/unit
Above 300  ₹12/unit

Customer Name
Units
Total Bill


================ *** NOTE *** ========================
we are using the slab-wise billing 
refer java-start book question 2)
*/
class bill{
    static int cc=5;// in main block global variable
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the customer name:");
        String n=sc.nextLine();
        System.out.print("Enter the no of units consumed:");
        int u=sc.nextInt();

        int nn=u;
        int answer=f1(nn);
        System.out.println("The Total cost = "+answer);
    }
    public static int f1(int nn){
        int n=nn;
        int sol=0;

        if(n>100){
                if (cc<=9) {    // for eg -: 240 means starting 200 (100 and 100)
                    sol+=100*cc;
                    cc+=2;
                    return sol+f1(n-100);
                }else{         //for eg-: 640 means cc will be more na above 9 so rest 340 with 12 rupees
                    sol+=n*12;
                    return sol;
                }
            }else{           // for eg-: last part of 240 means 40 that is less than 100 
                sol+=n*cc;  
                /*here i put the cc bcz if the remaining is the 5,7,9 it can take 
                any value of it */
                return sol;
    }
}
}

