import java.util.*;
class A
{
int a,b;
void getdata()
{
Scanner s=new Scanner(System.in);
System.out.println("enter 2 values:");
a=s.nextInt();b=s.nextInt();
}
}
class Addition extends A
{
int c;
void add()
{
c=a+b;
}
void display()
{
System.out.println("Addition is:"+c);
}
}
class C
{
public static void main(String...args)
{
Addition a=new Addition();
a.getdata();
a.add();
a.display();
} 
}