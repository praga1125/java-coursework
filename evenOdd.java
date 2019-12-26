public class evenOdd {
	int count(int n[] , String  condition ) {
		int sum =0;
		if(condition == "odd") {
			for(int i=0;i<n.length;i++) {
				if(n[i]%2 == 1) {
					sum += 1; 
				}
			}
		}
		else {
			for(int j=0;j<n.length;j++) {
				if(n[j]%2 == 0) {
					sum++;
				}
			}
			
		}
		return sum;
	}
public static void main(String args[]) {
	evenOdd obj = new evenOdd();
	int n[] = {1,2,3,4,5};
	int odd = obj.count(n , "odd");
	int even = obj.count(n, "even");
	System.out.println(odd);
	System.out.println(even);
			
}
}
