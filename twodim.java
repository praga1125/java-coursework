package First;
import java.io.*;
import java.util.*;
public class twodim{
  public static void main(String[] args){
      int i,j;
      
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the no of elements in array");
      int row=sc.nextInt();
      int col=row;
      int n[][]= new int[row][col];
      int m[][]= new int[row][col];
      System.out.println("enter the elements in array" );
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                n[i][j]= sc.nextInt();
            }
        }
        System.out.println("enter the elements in array" );
        for(i=0;i<row;i++){
           for(j=0;j<col;j++){
               m[i][j]= sc.nextInt();
            }           
        }
        
      int c[][] = new int[row][col];
          System.out.println("sum of the element");
           for(i=0; i<row; i++){
               for(j=0; j<col; j++){
		c[i][j] = m[i][j] + n[i][j];
                //System.out.println(c[g][f]);
                }  
            }
           for(i=0;i<c.length;i++){
               for(j=0;j<c.length;j++){
                   System.out.print(c[i][j] + " ");
               }
               System.out.println();
           }
         
}
     
}