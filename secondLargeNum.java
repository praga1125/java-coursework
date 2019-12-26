public class secondLargeNum {
	int largeNum(int[] numbers ) {
		int num = numbers[0];
		int num2 = numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(num > numbers[i]) {
				num = num2;
				num = numbers[i];	
			}
			else if(numbers[i] > num ){
               num2 = numbers[i];				
			}
		}
		return num2;
		
	}
public static void main(String args[]) {
	secondLargeNum obj = new secondLargeNum();
	int numbers[] = {11,33,55,1,6,44};
	int ans = obj.largeNum(numbers);
	System.out.println(ans);
}
}
