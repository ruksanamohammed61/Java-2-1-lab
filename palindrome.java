import java.util.*;
public class palindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int num=sc.nextInt();
int rev=0,rem,temp;
temp=num;
while(temp>0){
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(num==rev){
System.out.println("it is a palindrome");
}else{
System.out.println("it is not a palindrome");

}
}
}

