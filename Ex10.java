import java.util.*;
class NegativeNumberException extends Exception
{
NegativeNumberException(String err)
{
super(err);
}
}
class Ex10
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter an inter:");
int n=s.nextInt();
try
{
if(n<0)
throw new NegativeNumberException("input wrong");
else
{
int f=1;
for(int i=1;i<=n;i++)
f=f*i;
System.out.println("Factorial is:"+f);
}
}
catch(NegativeNumberException e)
{
System.out.println("enter input always+ve:"+e.getMessage());
}
}
}
