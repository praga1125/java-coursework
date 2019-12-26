public class sumOfEven {
public static void main(String args[]) {
	int arr[] = {1,2,3,4,5,6,7,8};
	int even = 0;
	int odd = 0;
	int sum  = 0;
 	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2 == 0) {
			even += arr[i];
		}
		else if(arr[i]%2 == 1) {
			odd += arr[i];
		}
		sum += arr[i];
	}
	
	System.out.println("the sum of even "+even);
	System.out.println("the sum of odd "+odd);
	System.out.println("the sum of whole digits "+sum);
}
}
