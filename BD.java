import java.io.*;
class A{
A(int a){
System.out.println("the area of a square is:"+a*a);
}
A(int a,int b){
super();
System.out.println("the area of a rectangle is:"+a*b);
}
A(int a,int b,int c){
super();
System.out.println("the volume of a cubiod is"+ a*b*c);
}
}
class BD{
public static void main(String[] args)throws IOException
{
A ob=new A(10);
A ob1=new A(10,2);
A ob2=new A(10,2,50);
}
}