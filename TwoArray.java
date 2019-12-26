public class TwoArray {
	int[] oddEven(int numbers[]) {
		int evenArray[] =new int[numbers.length];
		int oddArray[] =new int[numbers.length];
		int len = evenArray.length + oddArray.length;
		int oddIndex = 0;
		int evenIndex = 0;
		
		int count = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] > 0) {
				if(numbers[i]%2 == 0) {
					evenArray[evenIndex] = numbers[i];
					evenIndex++;
			   }
				else {
					oddArray[oddIndex] = numbers[i];
					oddIndex++;
				}
			}
		}
		int s[] =new int[evenIndex+oddIndex];
	   for(int i=0;i<evenIndex;i++) {
		   s[count] = evenArray[i];
		   count++;
		   }
		 for(int j=0;j<oddIndex;j++) {
			  s[count] = oddArray[j];
			   count++;
			}
		return s;
	}
public static void main(String args[]) {
	TwoArray obj =new TwoArray();
	int n[] = {1,2,3,4,5,6,7};
	 int ans[] = obj.oddEven(n);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i] + " ");
	}
}
}


//Java Concept Of The Day
//avaJ tpecnoC fO ehT yaD