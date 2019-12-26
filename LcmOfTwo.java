public class LcmOfTwo {
	int calculation(int a,int b) {
		int lcm = 1;
		while(true) {
			if(lcm % a == 0 && lcm % b  == 0) {
				return lcm;
			}
			++lcm;
			
		}
	}
public static void main(String args[]) {
	LcmOfTwo obj = new LcmOfTwo();
	int ans = obj.calculation(22,20);
	System.out.println(ans);
}
}
