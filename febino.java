package First;
import java.util.*;
public class febino {
    static int n1= 0 ,n2= 1,n3= 0;
    static void series(int num){
        if(num>0){      
             n3 = n1+n2;   
             n1 = n2;      
             n2 = n3;      
             System.out.print(" "+n3);     
             series(num-1);
}
}
    public static void main(String[] args){
        System.out.println("enter the no of febino series");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        System.out.print(n1+" "+n2);
        series(num-2);
}
}
