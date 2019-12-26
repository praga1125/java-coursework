public class swapDigit {
public static void main(String args[]) {
	int arr[] = {1,2,3,4,5,6,7};
	int swapnum1 = arr[0];
	int swapnum2 = arr[arr.length - 1];
	for(int i=0;i<arr.length;i++) {
		if(arr[i] > 0) {
			arr[0]=swapnum2;
			arr[arr.length - 1] = swapnum1;
			System.out.println(arr[i]);
		}
	}
}
}
