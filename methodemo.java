import java.util.*;
class add{
int a,b;
void setvalue(int x,int y){
a=x;
b=y;
}
void add(){
System.out.println("sum="+(a+b));
}
}
class methoddemo{
public static void main(String[] args){
add obj=new add();
obj.setvalue(30,20);
obj.add();
}
}