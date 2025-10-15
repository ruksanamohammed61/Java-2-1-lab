public class itc
{
string name;
void details(string name)
{
System.out.println("enter a name:"+name);
}
void dispaly()
{
System.out.println("name:"+name);
}
public static void main(String[] args)
{ 
itc i=new itc();
i.name="ruksana";
i.display();
}
}