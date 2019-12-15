package First;
import java.util.*;
public class onedim {
    int x = 10;
    public static void main(String[] args){
        int a[]=new int[50];
        int b[]=new int[50];
        Scanner sc= new Scanner(System.in);
        onedim obj =new onedim();
       System.out.println("enter the no of elements in array"+obj.x);
        int row=sc.nextInt();
        System.out.println("enter the element");
          for(int i=0;i<row;i++){
         a[i] = sc.nextInt();
     }
          System.out.println("enter the no of elements in array");
        int row2=sc.nextInt();
        System.out.println("enter the element");
          for(int i=0;i<row2;i++){
         b[i] = sc.nextInt();
          }
          int c[] = new int[2];
          System.out.println("sum of the element");
           for(int i=0; i<2; ++i){
		c[i] = a[i] + b[i];
                System.out.println(c[i]);
    }
}
}
