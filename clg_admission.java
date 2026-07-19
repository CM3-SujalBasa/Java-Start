import java.io.*;
import java.util.*;
/*
Input:

PCM Percentage
Entrance Exam Marks
Category

Admission Rules:

General
Percentage >=75
Entrance >=80
OBC
Percentage >=70
Entrance >=75
SC/ST
Percentage >=60
Entrance >=65

Print:

Eligible

or

Not Eligible

Also print the reason if the student is not eligible.
*/
class clg_admission{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the PCM Percentage: ");
        double pcm= sc.nextDouble();
        System.out.print("Enter the Entrance Exam Marks: ");
        double emarks= sc.nextDouble();
        System.out.print("Enter the Category(1:General, 2:OBC, 3:SC/ST): ");
        int cat= sc.nextInt();
        admission(pcm,emarks,cat);
    }
    public static void admission(double pcm1, double emarks1, int cat1) {
        int arr[]={1,2,3};
        boolean f=false;
        for(int i :arr){
            if (i==cat1) {
                f=true;
                break;
            }
        }
        if(f){
            switch (cat1) {
                case 1:
                        System.out.println("This is General Candidate:");
                        System.out.print(((pcm1<75.00)&&(emarks1<80.00))? " Candidate is NOT Eligible!!! PCM marks are less than 75 and Entrance marks are less than 80!!!" : ((pcm1>=75.00)&&(emarks1>=80.00))? " Candidate is Eligible!!!" : ((pcm1<75.00)? "\n Candidate is not Elegible because percentage is less then 75" : (emarks1<80.00)? "\n Candidate is not Elegible because Entrance marks is less than 80" : ""));
                    break;
                case 2:
                        System.out.print("This is OBC Candidate:");
                        System.out.print(((pcm1<70.00)&&(emarks1<75.00))? " Candidate is NOT Eligible!!! PCM marks are less than 75 and Entrance marks are less than 80!!!" : ((pcm1>=70.00)&&(emarks1>=75.00))? " Candidate is Eligible!!!" : ((pcm1<70.00)? "\n Candidate is not Elegible because percentage is less then 75" : (emarks1<75.00)? "\n Candidate is not Elegible because Entrance marks is less than 80" : ""));
                    break;
                case 3:
                        System.out.print("This is SC/ST Candidate:");
                        System.out.print(((pcm1<60.00)&&(emarks1<65.00))? " Candidate is NOT Eligible!!! PCM marks are less than 75 and Entrance marks are less than 80!!!" : ((pcm1>=60.00)&&(emarks1>=65.00))? " Candidate is Eligible!!!" : ((pcm1<60.00)? "\n Candidate is not Elegible because percentage is less then 75" : (emarks1<65.00)? "\n Candidate is not Elegible because Entrance marks is less than 80" : ""));
                    break;
            
                default:
                    break;
            }
        }else{
            System.out.println("Please enter the valid choice!!!");
        }
    }
}