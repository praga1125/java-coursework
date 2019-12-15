 package First;
import java.util.*;
public class sort {
  public static void main(String[] args){
      int count=5,temp;
        int n[] ={32,3,24,35,16};
        for(int i=0;i<count;i++){
        for(int j=i+1;j<count;j++){
            if(n[i]>n[j]){
            temp = n[i];
            n[i] = n[j];
            n[j] = temp;
}            
}    
}
    System.out.println("the ascending sorted elements");
    for (int i = 0; i<count; i++) {
     System.out.print(" "+n[i]);
}
    System.out.println(" ");
  int m[] ={02,33,24,44,12};
        for(int i=0;i<count;i++){
        for(int j=i+1;j<count;j++){
            if(m[i]<m[j]){
            temp = m[i];
            m[i] = m[j];
            m[j] = temp;
}            
}    
} 
         System.out.println("the decending sorted elements");
    for (int i = 0; i<count; i++) {
     System.out.print(" "+m[i]); 
}
    System.out.println(" ");
    System.out.println("the sum of sorted elements");
         int c[] = new int[5];
           for(int i=0; i<5; ++i){
		c[i] = n[i] + m[i];
                System.out.print(" "+c[i]);
    }
}
}