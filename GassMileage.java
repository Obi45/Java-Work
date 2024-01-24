import java.util.Scanner;
public class GassMileage{
public static void main(String[] arg){

Scanner input = new Scanner(System.in);
System.out.println("Enter the miles driven 0r -1 to terminate:");
double milesDriven = input.nextDouble();

System.out.println("Enter the gallon used:");
double gallonUsed = input.nextDouble();


double totalMilesDriven = 0;
 gallonUsed = 0;

while(milesDriven != -1){
totalMilesDriven += milesDriven;
gallonUsed += 1;

System.out.println("Enter the gallon used:");
 gallonUsed = input.nextDouble();

System.out.println("enter the miles driven or -1 to terminate");
milesDriven = input.nextDouble();

}
double milesPerGallon = milesDriven / gallonUsed;
System.out.printf("the miles per gallon is:%.2f%n", milesPerGallon);

double combinedMilesDriven = totalMilesDriven / gallonUsed;

System.out.printf("the combined miles driven is :%.2f%n", combinedMilesDriven);
}
}


