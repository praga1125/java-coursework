public class Perfectnumber {
	public static void main(String args[]) {
		int number = 28 ;
		int sumOfFactors = 0;
		for(int i=1;i < number;i++) {
			if(number%i == 0) {
				sumOfFactors += i; 
			}
		}
		if(sumOfFactors == number) {
			System.out.println("It is perfect number");
		} else {
			System.out.println("It is not perfect number");
		}
	}
}


//All Permutation : ABCD
//A, B, C, D
//
//ABCD, ABDC, ACBD, ACDB, AD
