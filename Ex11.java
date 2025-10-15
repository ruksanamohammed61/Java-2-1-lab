import java.util.*;
class InvalidMarksGradeException extends Exception
{
InvalidMarksGradeException(String err)
{
super(err);
}
}
class Ex11
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter grade for marks:");
String grades=s.next();
String v="A,B,C,D,E,F";
try
{
if(v.indexOf(grades)==-1)
throw new InvalidMarksGradeException("input mistake");
else
System.out.println("valid grade is:"+grades);
}
catch(InvalidMarksGradeException e)
{
System.out.println("entered grade is wrong:"+e.getMessage());
}
}
}
