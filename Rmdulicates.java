import java.util.*;
public class Rmdulicates {
public static void main(String args[]) {
	int arr[] = {1,2,3,3,2,6};
//	int result;
	Arrays.sort(arr);
	int count = arr.length;
	
	for(int i=0;i<count;i++) {
		int charCount = 1;
		while(i < count-1 && arr[i] == arr[i+1]) {
			i++;
			charCount++;
//			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[i]+" - "+ charCount);
	}
}
}
