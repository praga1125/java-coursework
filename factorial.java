public class factorial {
	 int j =1;
	int fact(int n) {
		j = j * n;
		if(n > 1) {
			fact(--n);
		}
		return j;
	}
public static void main(String args[]) {
	
	factorial obj = new factorial();
	int s = obj.fact(5);
	System.out.println(s);
}
}
