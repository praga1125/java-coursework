import java.io.*;
import java.util.*;
class Q
{
int a=10;
void printa()
{
System.out.println("a="+a);
}
}
class R extends Q
{
int b=20;
void printb()
{
System.out.println("b="+b);
}
}
class S extends R
{
int c=30;
void printc()
{
printa();
printb();
System.out.println("c="+c);
}
void sum()
{
System.out.println("sum of all ="+(a+b+c));
}
}
class inheritance
{
public static void main(String args[])
{
S obj=new S();
obj.printc();
obj.sum();
}
}

