public class swapTwoNumbers {
public static void main(String args[]) {
	int arr[] = {1,2,3};
	int temp = arr[0];
	int temp2 = arr[2];
	arr[0] = temp2;
	arr[2] = temp;
	for(int a : arr) {
		System.out.println(a);}
	
	char first = 'a';
	int asciiOfFirst = (int)first;
	System.out.println(asciiOfFirst);
}
}
