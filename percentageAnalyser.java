package First;
import java.util.*;

public class percentageAnalyser {
    public static void main(String args[]){
        char s ='y';
        String name;
        int noOfSubjects;
        
        while (s=='y'){
            Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the student name: ");
            name=sc.nextLine();
            System.out.println("Enter the number of subjects: ");
            noOfSubjects = sc.nextInt(); //5
            int marks[] = new int[noOfSubjects];
            System.out.println("Enter the marks:");
            for(int i=0;i<noOfSubjects;i++){
                marks[i]=sc.nextInt();
            }
            
            Student obj = new Student(marks);
            int percentage = obj.getPercentage();
            System.out.println("Percentage of " + name + " is " + percentage);
            System.out.println("Do u want continue? y-Yes n-No");
            s=sc.next().charAt(0);
        }
        
    }
}
class Student{
    int studentMarks[]; //[1,3,4,4]
    Student(int marks[]){
        studentMarks = marks;
    }
    int getPercentage(){
        int totalMarks = 0;
        for(int i=0;i<studentMarks.length;i++){
            totalMarks =  totalMarks + studentMarks[i];
           
        }
        return totalMarks/studentMarks.length;
    }
}

