public class fabinoCheck {
	public static int n1=0 , n2 =1 , n3 =0 , i=0;
	void fabino(int number) {
		while(n3 < number) {
			n3  = n1 + n2;
			n1 = n2;
			n2 = n3;
			}
		 if(n3 == number) {
				System.out.println("this number is febinochi");
			} 
		 else {
				System.out.println("this is not a febinochi number");
			}
		}
public static void main(String args[]) {
	fabinoCheck obj = new fabinoCheck();
	 obj.fabino(5);
}
}
