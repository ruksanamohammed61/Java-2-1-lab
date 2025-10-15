import  java.util.*;
public class armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int arm=0,temp;
System.out.println("enter a number:");
int num=sc.nextInt();
temp=num;
while(num>0)
{
int rem=num%10;
arm=rem*rem*rem+arm;
num=num/10;
}
if(temp==arm){
System.out.println(temp+"is a armstrong number");
}
else
{
System.out.println(temp+"is  not armstrong number");
}
}
}