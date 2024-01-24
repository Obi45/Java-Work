public class BirthYear1{
public static void main(String[] args){
System.out.println(BirthYear.getAge);

}
public static int getAge(){
System.out.println("enter your year of birth:");
int yearOfBirth = input.nextInt();

int currentYear = 2024;

int result = currentYear - yearOfBirth;
return result;
}
}
