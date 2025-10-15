import java.util.*;
public class factorial{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i, fact=1;
System.out.println("enter a number:");
int num=sc.nextInt();
for( i=1;i<=num;i++){
fact*=i;

System.out.println("factorial of"+fact);
}
}
}
