class student{
public int roll_no;
public String name;
student(int roll_no,String name){
this.roll_no=roll_no;
this.name=name;
} 
}
public class arrayobj{
public static void main(String[] args){
student[] arr=new student[3];
arr[0]=new student(1," spoorthi");
arr[1]=new student(2,"likitha");
arr[2]=new student(3,"ruksana");
for(int i=0;i<arr.length;i++)
System.out.println("element at " + i + ":{" + arr[i].roll_no +" "+arr[i].name +" }");
}
}                                                                                                    