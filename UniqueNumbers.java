import java.util.*;
public class UniqueNumbers {
public static void main(String args[]) {
	int[] a={1,2,33,2,13,3,44,2,1};
	Arrays.sort(a);
	int n = a.length;
	for(int i=0;i<n;i++) {
		int j = 1;
		while(i < n-1 && a[i] == a[i+1]) {
			i++;
			j++;
		}
		System.out.println(a[i]+ " - "+j);
	}
}
}

