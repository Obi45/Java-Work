import java.util.Scanner;
public class Arithmetic1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the first value");
int number1 = input.nextInt();

System.out.println("Enter the second value");
int number2 = input.nextInt();

int product1 = number1 * number1;
int product2 = number2 * number2;

int sumOfProduct = product1 + product2;

int differenceOfSquare =product2 - product1;

System.out.printf("%d %d %d %d",product1, product2, sumOfProduct,differenceOfSquare);


}




}