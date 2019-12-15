package First;
import java.util.*;

public class A {
    public static void main(String args[]){
        String name;
        int marks[] = new int[3];
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the student name ");
        name=sc.nextLine();
        System.out.println("Enter the marks ");
        for(int i=0;i<3;i++){
            marks[i]=sc.nextInt();
        }
        B obj=new B(marks);
        char s=obj.Percent();
        //C obj1=new C(s);
        //String d = obj1.greeter();
    //    System.out.println(s);
    }
}
class B{
    int marks[]; 
      B(int marks[]){
        this.marks = marks;
    }
    char Percent(){
        int totalMarks = 0;
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            totalMarks =  totalMarks + marks[i];
        }
        System.out.println("------------------------------------"+totalMarks);
        int n = totalMarks/marks.length;
        System.out.println(marks.length +" --- "+ n);
        if(n>80){
           return 'a'; 
        }
        else if(n<=80 && n>50){
            return 'b';
        }
        else {
            return 'c';
        }
    }
}
class C {
    char p;
    String n;
      C(char s) {
      p=s;
    }
    String greet;
    String greeter(){
     switch (p){
        case 'a':
            greet = "good";
            break;
        case 'b':
            greet ="better";
            break;
        case 'c':
            greet = "bad";
            break;

     }
      return greet; 
       
    }
    
}
