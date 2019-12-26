public class RecursionOdd {
	int n=0;
	int odd(int s) {
		int r =10;
		if(s <= r) {
			if(s%2 == 1) {
			   n += s;
			}
			odd(++s);
		}
		return n;
		
	}
public static void main(String args[]) {
	RecursionOdd obj = new RecursionOdd();
	int q = obj.odd(0);
	System.out.println(q);
	
	
}
}
