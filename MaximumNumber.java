public class MaximumNumber {
	int getMaxNumber(int a,int b, int c) {
		int greaterNumber = a > b ? ( a > c ? a : c) : ( b > c ? b : c );
		return greaterNumber;
		 
	}
public static void main(String args[]) {
	MaximumNumber maximumNumber = new MaximumNumber();
	int maxNumber = maximumNumber.getMaxNumber(4, 2, 8);
	System.out.print(maxNumber);
}
}
