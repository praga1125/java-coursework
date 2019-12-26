public class sumOfDigits {
	int result = 0;
	int sum(int number) {
		int reminder ;
		if(number > 0) {
		  reminder = number%10;
		  result = result + reminder;
		   sum(number/10);
		}
		return result;
	}
public static void main(String args[]) {
	sumOfDigits obj = new sumOfDigits();
	int result = obj.sum(2538);
	System.out.println(result);
}
}



