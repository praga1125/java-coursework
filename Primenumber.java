public class Primenumber {
	void primeNumbers(int number) {
		int result = 0;
		if(number == 1) {
       			System.out.println("this number is composite number");
		}
		else {
			for(int i = 1; i < number;i++) {
              if(number%i == 0) {
            	  result++;
              }
			}
			if(result == 1) {
          	  System.out.println("this number is prime number");
            }
            else {
          	  System.out.println("this is not a prime number");
            }
		}
	}
public static void main(String args[]) {
	Primenumber obj = new Primenumber();
	obj.primeNumbers(3);
}
}
