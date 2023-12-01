import java.util.Scanner;
public class CarApplication{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Car myCar1 = new Car("benz" ,"2023" ,30000 , 5.0);
Car myCar2 = new Car("toyota", "2023" ,40000, 7.0   );

System.out.println("enter a discount value for car1");
double discount1 = input.nextDouble();
myCar1.setDiscount(discount1);

System.out.println("enter a discount value for car2 ");
double discount2 = input.nextDouble();
myCar2.setDiscount(discount2);

System.out.printf("the discount price of car1 is: %f%n, and the discount price of car2 is %f%n", myCar1.getDiscount(),myCar2.getDiscount());







}
}