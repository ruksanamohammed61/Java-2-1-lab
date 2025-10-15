import java.util.*;
class MarksOutOfRangeException extends Exception
{
MarksOutOfRangeException(String err)
{
super(err);
}
}
class Ex9
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter marks:");
int marks=s.nextInt();
try
{
if(marks<0||marks>100)
throw new MarksOutOfRangeException("invalid input");
else
System.out.println("given marks are:"+ marks);
}
catch(MarksOutOfRangeException e)
{
System.out.println("marks always 0 to 100:"+e.getMessage());
}
}
}