import java.io.IOException;

public class ExceptionHandling {
	public static void main(String args[]){
		int a = 10;
		int array[] = {1,2,4};
		try {
//			int c = a/0;
//			throw new NullPointerException("Null Pointer");
			System.out.print("Hello");
			final int num = 10;
			
			System.out.print(num+1);
		} catch(ArithmeticException exception) {
			System.out.print(exception);
		} catch(NullPointerException exception) {
			System.out.print("Null 444 " + exception);
		}
		
	}
}
