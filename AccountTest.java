import java.util.Scanner;
public class AccountTest{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

Account myAccount = new Account();
System.out.println(" Enter a name");
String name1 = input.nextLine();

myAccount.setName(name1 );
String name2 = myAccount.getName();
System.out.printf("my name is : %s%n", name2);









}


}