import java.io.*;
import java.util.*;
/*
Age >=18
Citizen = true
Criminal Record = false
*/
class voting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //{name,citizen,age,criminal reacord}
        String a[][]={{"Raj","no","20","yes"},
                        {"Raju","yes","19","no"},
                        {"Rani","yes","18","no"},
                        {"Sai","yes","21","no"}
                    };
        System.out.print("Enter the name: ");
        String n=sc.nextLine();
        int flag=0;
        for(int i=0;i<a.length;i++){
            if(a[i][0].equalsIgnoreCase(n)){
                if( (Integer.parseInt(a[i][2]))>=18 && a[i][1].equalsIgnoreCase("yes") && a[i][3].equalsIgnoreCase("no") ){
                    System.out.println(n+" is valid to vote!!!");
                    flag=1;
                    return;
                }else{
                    System.out.println(n+" is not valid to vote!!!");
                    flag=1;
                    return;
                }
            }
        }
        System.out.println((flag==0) ? "The name is not persent in the voter list!!!" : "");
    }
}