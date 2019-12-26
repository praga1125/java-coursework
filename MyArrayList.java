import java.util.*;

public class MyArrayList {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();
		al.add(19);
		al.add(32);
		al.add(31);
		al.add(54);

		System.out.print(al);
		System.out.print("Size is :" + al.size());
		System.out.println(al.contains(21));
		System.out.print("Element at index 1 is : "+ al.get(1));
		
		int a[] = {22,4,311,43,33};
		Arrays.sort(a);
		System.out.println("Second greatest number: "+ a[a.length-2]);
		for (int n: a) {
			System.out.println(n);
		}

	}
}
