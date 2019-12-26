public class Fact {
	int factorial(int n) {
		int s = 1;
		while(n>1) {
			s =s * n;
			n--;
		}
		return s;
	}
public static void main(String args[]) {
	Fact obj = new Fact();
	int  r = obj.factorial(5);
	System.out.println(r);
}
}
