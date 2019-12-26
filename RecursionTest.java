
public class RecursionTest {
	int total = 0;
	int Add(int array[], int  totalCount) {
		if(totalCount >= 0) { //n.length
			total += array[totalCount];
			Add(array, --totalCount);
		}
		return total;
	}
	public static void main(String args[]) {
		RecursionTest obj = new RecursionTest();
		int s[] = {1, 2,3,4,5,};
		int totalCount = obj.Add(s, s.length-1);
		System.out.println("Total Count of Array is " + totalCount);
	}
}
