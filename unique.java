package First;
import java.util.*;
public class unique {
    public static void main(String args[]){
        int[] a={1,2,33,2,13,3,44,2,1};
        int arr[];
        int uniqueElementArray[] = new int[a.length * 2];
         Arrays.sort(a);
//         for(int i: a){
//             System.out.println("Value is: "+ i);
//         }
         int uniqueIndex = 0;
         for(int i=0;i<a.length;i++){
          for(int j=0;j<i;j++){   
            if(a[i] < a[j] ){
                System.out.println("a[i]" + a[i] +" a[j]" + a[j] );
                uniqueElementArray[uniqueIndex] = a[i]; 
                uniqueIndex++;
                break;
            }
            }
        }
//         for(int x :uniqueElementArray ){
//             System.out.println("Unique: " + x );
//         }
    }
}


/*
 static void printDistinct(int arr[], int n) 
    { 
        // Pick all elements one by one 
        for (int i = 0; i < n; i++) 
        { 
            // Check if the picked element  
            // is already printed 
            int j; 
            for (j = 0; j < i; j++) 
            if (arr[i] == arr[j]) 
                break; 
      
            // If not printed earlier,  
            // then print it 
            if (i == j) 
            System.out.print( arr[i] + " "); 
        } 
    } 
*/