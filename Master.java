package First;

public class Master {
    public static void main(String args[]){
       StudentManager studentManager = new StudentManager("praga");
         StudentManager studentManager1 = new StudentManager("t");
          StudentManager studentManager2 = new StudentManager("r");
    } 
}
class StudentManager{
    String stuname;
   StudentManager(String name){
 
       System.out.println("name is "+name);
   }
}