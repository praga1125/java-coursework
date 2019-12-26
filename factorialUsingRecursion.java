public class factorialUsingRecursion {
	int result = 1;
	int factorial(int number) {
		if(number > 1) {
			result *= number;
			factorial(--number);
		}
		return result;
	}
public static void main(String args[]) {
	factorialUsingRecursion obj = new factorialUsingRecursion();
	int ans = obj.factorial(5);
	System.out.println(ans);
}
}
