import java.util.*;
import java.lang.*;
public class quadratic{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the coefficient a: ");
double a = scanner.nextDouble();
System.out.print("Enter the coefficient b: ");
double b = scanner.nextDouble();
double D = b * b - 4 * a * 0; // Since c = 0 in the equation ax^2 + bx = 0
if (D > 0) {
// Two distinct real roots
double root1 = (-b + Math.sqrt(D)) / (2 * a);
double root2 = (-b - Math.sqrt(D)) / (2 * a);
System.out.println("The roots are real and distinct.");
System.out.println("Root 1: " + root1);
System.out.println("Root 2: " + root2);
} else if (D == 0) {

double root = -b / (2 * a);
System.out.println("The roots are real and equal.");
System.out.println("Root: " + root);
}
else{
System.out.println("Roots are Imaginary");
real=-b/(2*a);
imag=Math.sqrt(-disc)/(2*a);
System.out.println("The Root1 is %f+%fi",real,imag);
System.out.println("The Root2 is %f-%fi",real,imag);
}
}//main close
}//class close



