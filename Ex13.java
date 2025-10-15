import java.util.*;
class Ex13
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter 2 values");
int a=s.nextInt();int b=s.nextInt();
try
{
try
{
int c=a/b;
System.out.println("division is:"+c);
}
catch(ArithmeticException e)
{
throw e;
}
}
catch(ArithmeticException e)
{
System.out.println("divide err..."+e.getMessage());
}
}
}