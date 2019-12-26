public class reverse {
	void recurrsion(int n[],int  index) {
		if(index < n.length) {
		System.out.print(n[index]+" ");
		recurrsion(n, ++index);
		}
	}
public static void main(String args[]) {
	reverse obj = new reverse();
	 int a[] = {1,2,3,2,4,34,1,23};
	obj.recurrsion(a, 0);
}
}
