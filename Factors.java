import java.math.*;
public class Factors {
	boolean isAmstrong(int number) {
		int amstrongResult = 0;
		int givenNumber = number;
		while(number>0) {
			int remainder = number % 10;
			amstrongResult = amstrongResult + (remainder*remainder*remainder); 
			number = number / 10;
		}
		if(givenNumber == amstrongResult) {
			return true;
		}
		return false;
	}
public static void main(String args[]) {
	int number = 24;
	int count = 0;
	for(int i= 1;i<=number;i++) {
		if(number%i == 0) {
			System.out.println(i);
			count++;
		}
	}
	if(count == 2) {
		System.out.println("The given number is Prime number");
	}else {
		System.out.println("The given number is NOT Prime number");
	}
	Factors factors = new Factors();
	System.out.println(factors.isAmstrong(153));
}
}


