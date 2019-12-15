package First;
import java.util.*;

public class ArrayExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for(int i=0;i<size;i++){
            total = total + arr[i];
        }
        
        System.out.print("TOTAL is : " + total);
    }
}
