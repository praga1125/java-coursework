public class largestNum {
	void large(int n[]) {
		int num = n[0];
		int num2 = n[0];
		int r = n[0];
		for(int i=0;i<n.length;i++) {
		if(n[i] < num) {
			num = num2;
			num = n[i];
		}
		if(n[i] < num2) {
			
			num2 = n[i];
		}
		
		if(n[i] > r) {
			r = n[i];
		}
		}
		System.out.println("the  second maximum number is " + num2);
	    System.out.print("the minimum number is " +r);	
		
	}
public static void main(String args[]) {
	largestNum obj = new largestNum();
	int n[] = {11,24,3,4,56};
	obj.large(n); 
}
}
