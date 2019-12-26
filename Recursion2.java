
public class Recursion2 {
	  int d = 0;
	void recursion(int n) {
		int a = 10;
		if(n <= a) {
			System.out.print(n + " ");
	        recursion(++n);
		}
		
	}
    int odd(int s) {
    	int r = 10;
    	if(s <= r) {
    	if(s%2 == 1) {
    		d += s; //d = d+s
    		System.out.print(s + " ");
    	}
    	odd(++s);
    	}
    	return d;
    }
	public static void main(String args[]) {
	Recursion2 recursion2 = new Recursion2();
	int  w = recursion2.odd(0);
	System.out.println(w);
//	recursion2.recursion(0);
}
}
