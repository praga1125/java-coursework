public class GcdOfTwo {
	int greatCommonDivisor(int a,int b) {
		int gcd = 0;
		for(int i=1; i<=a || i<=b;i++) {
			if( a % i == 0 && b % i == 0) {
               gcd = i ;				
			}
		}
		return gcd;
	}
public static void main(String args[]) {
   GcdOfTwo obj = new GcdOfTwo();
   int ans = obj.greatCommonDivisor(5,20);
   System.out.println(ans);
}
}
