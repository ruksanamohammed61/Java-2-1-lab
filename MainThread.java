class T1 extends Thread
{
public void run()
{
if(Thread.currentThread().isDaemon())
System.out.println("Thread is Daemon Thread....");
else
System.out.println("noraml Thread");
}
}
class MainThread
{
public static void main(String...args)
{
T1 t1=new T1();
T1 t2=new T1();
t1.setDaemon(true);
t1.start();
t2.start();
}
}