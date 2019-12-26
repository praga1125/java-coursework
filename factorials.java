public class factorials {
	 int result =1;
	int fact(int number) {
		 result *= number;
		if(number > 1) {
			fact (--number);
		}
		return result;
	}
public static void main(String args[]) {
	factorials obj = new factorials();
     int ans = obj.fact(5);
     System.out.println(ans);
}
}
