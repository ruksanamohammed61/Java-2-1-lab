import java.util.*;
class calculator{
int a,b;
void add(int a,int b)
{
this.a=a;
this.b=b;
return a+b;
}
}
public class expcal{
public static void main(String[] args){
calculator c=new calculator();
Scanner sc=new Scanner(System.in);
System.out.println("enter first value:");
int a=sc.nextInt();
System.out.println("enter second value:");
int b=sc.nextInt();
 int result=c.add(a,b);
System.out.println("the addition is:"+ result);


}
}
