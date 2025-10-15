import java.util.*;
class Ex1
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter two values:");
int a=s.nextInt();int b=s.nextInt();
try
{
int c=a/b;
System.out.println("division is:"+c);
}
catch(ArithmeticException e)
{
System.out.println("dont enter denominator as 0");
}
}
}