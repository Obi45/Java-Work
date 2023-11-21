import java.util.Scanner;
//import java.lang;
public class CircleCircumference{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a number for radius");
double radius = input.nextDouble();
double pi = Math.PI;

double circumference = 2 * pi * radius;
System.out.printf("the circumference of the circle is: %d%n", circumference);


}



}