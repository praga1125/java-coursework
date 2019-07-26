import java.io.*;
class A
{
int x,y;
A(int a,int b)
{
x=a;
y=b;
}
void show()
{
System.out.println("x is "+x+" and  y is "+y);
}
}
class B extends A
{
int l;
B(int a,int b, int c)
{
super(a,b);
l=c;
}
void show(String f)
{
System.out.println(f+l);
}
}
class overloading
{
public static void main(String args[])
{
B obj=new B(25,22,11);
obj.show("my fav number:");
obj.show();
}
}

