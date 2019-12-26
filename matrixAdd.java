public class matrixAdd {
public static void main(String Args[]) {
	int number[][] = {{1,2,3},{3,4,5},{3,4,5}};
	int number2[][] = {{1,2,3},{3,4,5},{3,4,5}};
	int sum [][] = new int[number.length][number2.length];
	for(int i=0;i<number.length;i++) {
		for(int j=0;j<number2.length;j++) {
			sum[i][j] = number[i][j] - number2[i][j];
		}
	}
	int n = number.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(sum[i][j] + " ");
		}
		System.out.println();
	}
}
}
