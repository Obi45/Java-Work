import java.util.Scanner;
public class WeekDays{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	System.out.println( "Enter a number for days");
	int day = input.nextInt();

	System.out.println("Enter number for month");
	int month = input.nextInt();

	System.out.println("Enter a number for year");
	int year = input.nextInt();

	System.out.println(" enter days of the week");
	int daysOfTheWeek = input.nextInt();
	
	int century = year /100;

	int yearOfTheCentury = year % 100;
	
	if ( daysOfTheWeek == 0)
	int days = daysOfTheWeek;
	System.out.println("saturday");
	if ( daysOfTheWeek == 1)
	System.out.println("sunday");
	if ( daysOfTheWeek == 2)
	System.out.println("monday");
	if ( daysOfTheWeek ==3)
	System.out.println("tuesday");
	if (daysOfTheWeek ==4)
	System.out.println("wednesday");
	if (daysOfTheWeek = 5)
	System.out.println("thursday");
	if (daysOfTheWeek==6)
	System.out.println("friday");

	int result = (day + (26 *( month + 1 )/ 10) + (year % 100 )+ (year 	% 	100 / 4 ) + (year /400) + (5 * year / 100 ) % 7 );

	System.out.printf("%d%n",result);
