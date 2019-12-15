package First;
import java.io.*;
import java.util.*;
public class student {
    percentage obj= new percentage();
    int n[]={10,20,30,40,50};

    obj.percentage("praga",n[]);
    void percentage1(){
        
    }
}
class percentage{
    char ans;
    char s;
    student obj2=new student();
    String name;
    int input; 
    int mark[]=new int[input];
    Scanner sc= new Scanner(System.in);
    do{
    void percentage(String n,int m[10]){
        name=n;
        mark[input]=m[10];
    System.out.print("student name :  "+name);
    for(int i=0;i<mark[input];i++)
    System.out.println("mark :"+mark[i]);
    obj2.percentage1();
    System.out.println("do u want continue");
    ans =sc.nextChar();
    }while(ans == s)
}
}
