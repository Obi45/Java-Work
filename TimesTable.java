import java.util.Scanner;
public class TimesTable{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter a number");
int number = input.nextInt();


int count = 1;
//if (number <= 1 || number > 12){
//System.out.println("try another time");
//}
while(count <= 12){
int value = number * count;
System.out.println(number + " x " + count + " = " + value);
count++;

}
}
}
