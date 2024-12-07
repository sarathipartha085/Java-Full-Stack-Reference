class A extends Thread
{
public void run()
{
int c=20+30;
System.out.println("A Thread" + c);
System.out.println("Exiting A Thread");
}
}
class B extends Thread
{
public void run()
{
float d=((23*12)/3); 
System.out.println("B Thread" + d);
System.out.println("Exiting B Thread");
}
}
public class multithread
{
public static void main(String[] arg)
{
String str="Welcome";
System.out.println("String"+str);
System.out.println("Exiting Main method");
A a = new A();
B b= new B();
b.start();
a.start();

}
}

