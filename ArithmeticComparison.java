import java.util.Scanner;
public class ArithmeticComparison{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the first number");
int number1 = input.nextInt();

System.out.println("Enter the second number");
int number2 = input.nextInt();

System.out.println("Enter the third number");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;
System.out.println(sum);

int average = sum / 3;
System.out.println(average);

int product = number1 * number2 * number3;
System.out.println(product);


if (number1 > number2 && number1 > number3){
System.out.printf("number1");
}
if (number2 > number1 && number2 > number3){
System.out.println("number2");
}
if (number3 > number1 && number3 > number2){
System.out.println("number3");
}
if ( number1 < number2 && number1 < number3){
System.out.println("number1");
}
if (number2 < number1 && number2 < number3){
System.out.println("number2");
}
if ( number3 < number1 && number3 < number2){
System.out.println("number3");
}

}




}