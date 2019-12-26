public class RecursionExamples {
	int a = 10;
	void printNaturalNumber(int n) {
		if(n <= a) {
			System.out.print(n +" ");
			printNaturalNumber(++n);
		}
	}
	
	public static void main(String args[]) {
		RecursionExamples obj = new RecursionExamples();
		obj.printNaturalNumber(0);
	}

}
