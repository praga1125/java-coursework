import java.lang.reflect.Array;

public class unionInterset {
public static void main(String args[]) {
	int array1[] = {1,2,3};
	int array2[] = {3,4,5};
	int k = 0;
	int len = array1.length + array2.length;
	int union[] = new int[len];
	//int intersect[] = new int [array1.length];
	for(int i =0;i<array1.length;i++) {
		if(union[i] != array1[i]) {
			union[k] = array1[i];
			k++;
	}
		for(int j =0;j<array2.length;j++) {
			if(union[i] != array2[j] ) {
				union[k] = array2[j];
				k++;
			}
		}		
	}
for(int i=0;i<union.length;i++) {
	System.out.println(union[i] +" ");
}	
}
}
