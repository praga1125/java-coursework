public class Arraysum {
	int add = 0;
	int sum(int n[] , int index  ) {
		if(index >= 0 ) {
		add = n[index] + add;
		sum(n , --index );
		}
		return add;
	}
public static void main(String args[]) {
	Arraysum obj = new Arraysum();
	int ar[] = {1,2,3,4,5};
	 int s =obj.sum(ar , ar.length-1  );
	 System.out.println(s);
}
}
