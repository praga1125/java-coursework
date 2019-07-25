import java.io.*;
import java.util.*;
abstract class a
{
 void call()
{
System.out.println("hello praga");
}
}
class b extends a
{
void call2()
{
System.out.println("how are u ");
}
}
class testabstract
{
public static void main(String args[])
{
 b back=new b();
 back.call();
 back.call2();
}
}



