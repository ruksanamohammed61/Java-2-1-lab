class parent{
void display(){
System.out.println("parent display method");
}
}
class child extends parent{
void display(){
super.display();
System.out.println("child display method");

}
}
public class main{
public static void main(String[] args){
child c=new child();
c.display();
}
}