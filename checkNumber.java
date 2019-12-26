public class checkNumber {
	String checkOddOrEven(int n) {
	  String evenOrOdd = (n%2 == 0 ? "even": "odd");
	  return evenOrOdd;
	}
public static void main(String args[]) {
	checkNumber CheckNumber = new checkNumber();
	String checker =  CheckNumber.checkOddOrEven(212);
	System.out.println("the number is "+ checker );
	
}
}
