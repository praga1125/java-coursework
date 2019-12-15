package First;
import java.util.*;

public class Bookstore {
    void addBook(){
        Books obj =new Books();
        obj.add();
    }
    void listBook(){
        Books obj =new Books();
        obj.listBook();
    }
    public static void main(String args[]){ 
       Scanner sc =new Scanner(System.in);
       //System.out.println("Enter the book title");
       //String s=sc.nextLine();
       //System.out.println("enter the author name");
       //String v=sc.nextLine();
       Bookstore obj2= new Bookstore();
       System.out.println("enter your choice");
       System.out.println("1.addBook");
       System.out.println("2.listbook");
       int n= sc.nextInt();
       switch(n){
           case 1:
              obj2.addBook();
              break;
           case 2:
               obj2.listBook();
               break;
               
           }
               
       }
       
    }
class Books{
    String s,v;
     void add(){
       Scanner sn=new Scanner(System.in);
       System.out.println("Enter the book title");
       s=sn.nextLine();
       System.out.println("enter the author name");
       v=sn.nextLine();
     }
void listBook(){
   System.out.println("the author name is "+ s);
   System.out.println("the title name is "+ v);
       
}
}
