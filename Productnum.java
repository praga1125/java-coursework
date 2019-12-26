public class Productnum {
	int product(int n) {
		int prod = 1;
		while(n != 0) {
			prod = prod*(n%10);
			n = n/10;
			
		}
		return prod;
	}
public static void main(String args[]) {
	Productnum obj =new Productnum();
	int sum = obj.product(544);
	System.out.println(sum);
}
}
