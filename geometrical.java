abstract class shape{
abstract void numberofsides();
}
class trapizium extends shape{
void numberofsides(){
System.out.println("a trapizium has four sides");
}
}
class triangle extends shape{
void numberofsides(){
System.out.println("a triangle has three sides");
}
}
class hexagon extends shape{
void numberofsides(){
System.out.println("a hexagon has six sides");
}
}
class geometrical{
public static void main(String[] args){
shape s1=new trapizium();
shape s2=new triangle();
shape s3=new hexagon();
s1.numberofsides();
s2.numberofsides();
s3.numberofsides();
}
}
