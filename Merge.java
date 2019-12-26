public class Merge {
	int[] mergeArr(int n[], int m[] ) {
		int arrLen = n.length + m.length;
		int mergarr[] = new int[arrLen];
		int k=0;
		for(int i=0;i<n.length;i++) {
			mergarr[k] = n[i];
			k++;
		}
		for(int i=0;i<m.length;i++) {
			mergarr[k] = m[i];
			k++;
		}
		return mergarr;
		
	}
public static void main(String args[]) {
	Merge obj =new Merge();
	int n[] = {1,2,3};
	int m[] = {3,4,5};
	int mergedArray[] = obj.mergeArr(n,m);
	for(int element: mergedArray) {
		System.out.println(element);
	}
	
}
}
