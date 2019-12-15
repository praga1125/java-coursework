package First;
import java.util.*;
public class fun {
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the factorial number");
       int n = sc.nextInt();
       int factorial=fact(n);
      System.out.println("the factorial of given number  "+factorial);
    }

 static int fact(int p){
    int result;
    if(p==1){
        return(p = 1); 
    }
    result=fact(p-1)*p;
    return(result);
}
}