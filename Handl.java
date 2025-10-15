package week;
 public class Handl {
    public static void main(String[] args){
        try
        {
            int a=20,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception:\n"+e);
        }
        finally{
            System.out.println("finally is executed");
        }

        }
        }