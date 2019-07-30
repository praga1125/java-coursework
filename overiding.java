import java.io.*;
class A
{
int i,j;
A(int a, int b)
{
i=a;
j=b;
}
void show() 
{
System.out.println("a ="+i);
System.out.println("b ="+j);
}
}
class B extends A
{
int s;
B(int a,int b,int c)
{
super(a,b);
s=c;
}
void show()
{
super.show();
System.out.println("c ="+s);
}
}
class overiding
{
public static void main(String args[])
{
B obj=new B(1,2,3);
obj.show();
A obj2=new A(10,20);
obj2.show();
}
}

