import java.util.*;
public class evenorodd{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("enter a number:");
int num=sc.nextInt();
if(num%2==0)
{
System.out.println(num+"is a even number");
}
else{
System.out.println(num+"is a odd number");
}
}
}
}