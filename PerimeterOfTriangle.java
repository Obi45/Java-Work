import java.util.Scanner;
public class PerimeterOfTriangle{
public static void main(String[] args){


	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number for the first side");
	int side1 = input.nextInt();

	System.out.println("Enter a number for second side");
	int side2 = input.nextInt();

	System.out.println ("Enter a number for third side");
	int side3 = input.nextInt();

	 if ( side1 + side2 > side3 ||side1 + side3 > side2 || side2 + side3 > 	side1){
	System.out.println("valid");
	}
	else {
	System.out.println("invalid");
	}
	//else if(side1 + side3 <= side2){
	//System.out.println("invalid");
	//}
	//else if( side2 + side3 <= side1){
	//System.out.println("invalid");
	//}




}



}