public class PrimeNnumbers {
	int[] prime(int number) {
		int result[] = new int[10];
		int k =0;
		for(int i=1;i<number;i++) {
			if(number%i == 0) {
				result[k] = result[k]+i;
				k++;
			}
		}
		return result;
	}
public static void main(String args[]) {
	PrimeNnumbers obj = new PrimeNnumbers();
	int ans[] = obj.prime(25);
	for(int i=0;i<ans.length;i++ ) {
		System.out.println(ans[i]);
	}
}
}
