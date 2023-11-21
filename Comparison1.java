import java.util.Scanner;
public class Comparison1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter whole number");
int number = input.nextInt();

int product = number * ( number * number);
	
if ( product > 100){
System.out.printf("%d > 100",  product);
}
if (product == 100){
System.out.printf("%d == 100",product);
}
if (product != 100){
System.out.printf("%d != 100",product);
}
if ( product < 100){
System.out.printf("%d < 100",product);
}




}

} 