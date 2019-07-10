import java.io.*;
import java.util.*;
class wow
{
public static void main(String[] args)
{
System.out.println("hello praga");
Scanner o=new Scanner(System.in);
System.out.println("enter the table number");
int n;
n=o.nextInt();
System.out.println("mulitiplication table for "+n+"is");
for(int i=1;i<=10;i++)
{
System.out.println(i+"x"+n+"="+n*i);
}
}
}
