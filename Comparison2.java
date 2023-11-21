import java.util.Scanner;
public class Comparison2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter a value");
int number1 = input.nextInt();

int product = number1 * number1;
System.out.println(product);

if ( number1 > 100 && product > 100){
System.out.println("number1 and the product is greater than 100");
}
if ( number1 < 100 && product < 100){
System.out.println("number1 and the product is less than 100");
}
if (number1 == 100 && product == 100){
System.out.println("number1 and the product is equal to 100");
}
if (number1 != 100 && product != 100){
System.out.println("number1 and the product is not equal to 100");
}




}




}