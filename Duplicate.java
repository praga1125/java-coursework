import java.util.*;

public class Duplicate {
	int[] getUniqueNumbers(int n[]) {
		int unique[] = new int[n.length];
		Arrays.sort(n);
		int k=0;
		for(int i=0;i<n.length;i++) {
			
			while(i<n.length-1 && n[i] == n[i+1]) {
//				unique[k] = n[i];
				k++;
			}
		return unique;
		}
	}
	int count (int n[]) {
		int uniqueNumbers[] = getUniqueNumbers(n);
		int c[][] = new int [n.length][n.length];
		for(int i = 0;i<n.length;i++) {
			int numCount = 0;
			 for(int j=0;j<n.length;j++) {
               if(n[j] == n[j+1]) {
            	   
               }
			 }
//			c[i][0]=n[i]
//					c[i][1]=su
			}
		}
		return 0;
	}
public static void main(String args[]) {
	Duplicate obj =new Duplicate();
	int n[] = {1,2,5,3,4,5,4,9,5,9,4};
	int count = obj.count(n);
	System.out.println(count);
}
}
