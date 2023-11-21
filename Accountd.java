public class Accountd{
private String name;
private double balance;

public Accountd(String name, double withdrawal){
this.name = name;
this.withdrawal = withdrawal;
}
public void deposit(double deposit){
if (deposit > 0.0 ){
balance = balance + deposit;
}
}
public void withdrawal(double withdrawal){
if (withdrawal < balance ){
withdrawal = balance - withdrawal;
}
}
public double getWithdrawal(){
return withdrawal;
}
public void setName(String name){
this.name = name;
}
public String getNname(){
return name;
}
}



