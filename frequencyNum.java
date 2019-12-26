import java.util.*;
public class frequencyNum {
public static void main(String args[]) {
	int arr[] = {1,2,33,2,1,44,33};
	Arrays.sort(arr);
	int arr2[][] = new int[arr.length][arr.length];
	int count = arr.length;
	for(int i=0;i<count;i++) {
		int count1 = 0;
		for(int j=0;j<count;j++) {
		  while ( i<count-1 && arr[i] == arr[j+1]) {
			  count1++;  
		  }
		}
		arr2[i][0] = arr[i];
		arr2[i][1] = arr[i];
	}
	for(int i=0;i<arr2.length;i++) {
     System.out.print(arr2[i][0]+" - "+arr2[i][1]);	
	}
	
	
}
}
