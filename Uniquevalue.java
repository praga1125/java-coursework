import java.util.*;
public class Uniquevalue {
public static void main(String args[]) {
	int n[] = {1,2,3,4,6,4,3,2};
	int numberFrequency[][]= new int [n.length][n.length];
	 Arrays.sort(n);
	int s = n.length;
	int index = 0;
	for(int i=0;i<s;i++) {
		 int j = 1;
		while(i < s-1 && n[i] == n[i+1]) {
			i++;
			j++;
		}
		numberFrequency[index][0]=n[i];
		numberFrequency[index][1]=j;
		index++;
		System.out.println(n[i]+" - "+j);
	}
	for(int i = 0;i<numberFrequency.length;i++) {
		for(int j = 0; j<index;j++) {
			System.out.print(numberFrequency[i][j]+ " ");
		}
		
	}
}
}

