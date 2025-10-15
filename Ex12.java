import java.util.*;
class Ex12
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter 2 values");
int a=s.nextInt();int b=s.nextInt();
int ar[]={333,56,33};
try
{
int c=a/b;
System.out.println("division is:"+c);
try
{
System.out.println("enter index to display array value:");
int i=s.nextInt();
System.out.println("Array value is:"+ar[i]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array out of boundry:"+e.getMessage());
}
}
catch(ArithmeticException e)
{
System.out.println("divide err..."+e.getMessage());
}
}
}