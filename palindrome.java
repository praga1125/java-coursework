public class palindrome {
	void reverse(String word) {
		char arr[] = word.toCharArray();
		int count =0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] == word.charAt(i)) {
				count++;
			}
		}
		if(count > 0) {
			System.out.println("this word is palindrome");
		} else {
			System.out.println("this word is not palindrome");
		}
	}
public static void main(String args[]) {
	palindrome obj =new palindrome();
	String word = "malayalam";
	obj.reverse(word);
}
}
