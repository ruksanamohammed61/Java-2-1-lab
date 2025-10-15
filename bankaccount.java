import java.util.*;
public class bankaccountmanager{
int accountnumber;
string accountholder;
float balance;
final float minamount=100.00;
bankaccountmanager(int accno,string acchold,float bal)
{
accountholder=acchold;
accountnumber=accno;
balance=bal;
}
public void deposit(float amount)
{
balance+=amount;
System.out.prinntln("deposited "+amount);
}
public boolean withdraw(float ammount)
{
if(balance>amount&&(balancce-amount)>minbalance)
{
balance-=amount;
System.out.println("withdraw "+amount);
}
else{
System.out.println("insufficient fund");
}
}
public void display()
{
account summary;
accountholder:
accountnumber;
balance;
}
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter account number:");
int accno=s.nextInt();
System.out.println("enter acc holder name:");
string acchold=s.next();
system.out.println("enter initial deposit:");
float bal=s.nextFloat();
bankaccountmanager myaccount=new bankaccountmanager(acchold,acno,bal);
int choice=s.nextInt();
boolean running=true;
while(running){
system.out.println("\n 1.deposit \n 2.withdraw \n 3.display \n 4.exit");
System.out.println("enter your choice:");
switch(choice){
case 1:System.out.println("enter amount:");
        float amount=s.nextFloat();
       deposit(amount);
       break;
case 2:System.out.println("enter amount:");
       float amount=s.nextFloat();
       withdraw(amount);
       break;
case 3:display();
       break;
case 4:running=false;
       System.out.println("thank you for using bank account manager");
       break;
default:System.out.println("enter valid choice:");
        break;

}
}
}