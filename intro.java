import java.io.*;
import java.util.*;
import java.math.*;
// Print your introduction.
// Area of a circle.
// Largest of three numbers.
// Even or Odd.
// Positive, Negative or Zero.
class intro{
    public static void main(String[] args) {
        System.out.println("Hi! I am Sujal Sadanand Basa. I am from Solapur. I am currently studying in the ISBMCOE in computer Engineering Branch. ");
        System.out.println(" if the radius of the circle= 4 then the, Area of the circle is="+(Math.PI*4*4));
        System.out.println("10,35,100");
        int a = (10>35) ? ((10>100) ? 10:100) : ((35>100) ? 35:100);
        System.out.println("Amoung the 3 no's the highest is ="+a);
        int c=37;
        System.out.println("The no''s are "+c);
        String b= (c==0) ? ("It is Zero") : (c>0) ? ((c%2==0) ? "It is Even +ve" : "It is Odd +ve" ) : ((c%2==0)? "It is Even -ve" : "It is Odd -ve");;
        System.out.println(b);
    }
}