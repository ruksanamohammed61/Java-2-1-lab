import java.util.*;
class bank{
int ac_no;
String name,type;
float amount;
void details(int n,String nm,string t,float a)
{
ac_no=n;
name=nm;
type=t;
amount=a;
}
void show()
{
System.out.println(ac_no+" "+name+" "+type+" "+amount);
}
void despoit(float a)
{
amount+=a;
System.out.println("deposit amount:"+a);
}
void withdraw(float a)
{
if(amount>a)
System.out.println("insufficient balance");
else
amount-=a;
system.out.println("withdrawamount:"+a);
}
void checkamount()
{
System.out.println("amount is:"+a);
}
}
class test{
public static void main(String[] srgs){
bank b=new bank(0;
b.details(12345,"ruksana","saving",1000);
b.show();
b.deposit(40000);
b.checkamount();
b.withdraw(10000);
b.checkamount();
}
}