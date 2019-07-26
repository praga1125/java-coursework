import java.io.*;
class animal
{
void write()
{
System.out.println("animal");
}
}
class dog extends animal
{
void write()
{
System.out.println("dog");
}
}
class cow extends animal
{
void write()
{
System.out.println("cow");
}
}
class polymorphism
{
public static void main(String args[])
{
animal a1=new animal();
animal a2=new dog();
animal a3=new cow();
a1.write();
a2.write();
a3.write();
}
}



