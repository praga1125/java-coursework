public class divisible {
	int divisor(int number) {
		int result =0;
		if(number%5 == 0 && number%11 == 0) {
			result += number;
			
		}
		else {
			System.out.print("it is not a divisible by 5 and 11");
		}
		return result;
	}
public static void main(String args[]) {
	divisible obj = new divisible();
	int ans = obj.divisor(55);
	if(ans != 0) {
	System.out.println(ans+" this number is divisible by 5 and 11");
	}
}
}
