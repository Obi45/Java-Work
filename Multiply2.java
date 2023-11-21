import java.util.Scanner;
pulic class Multiply2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number1 = input.nextInt();

System.out.println("Enter second number");
int number2 = input.nextInt();
int value1 = number1 * number1 * number1;
int value2 = number2 * number2;
int result = value1 % value2;
System.out.printf("%d%n", result);








}




}