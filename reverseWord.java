public class reverseWord {
	String reverseString(String sentence) {
		String words[] = sentence.split(" ");
		String finalString =" ";
		for(int i=0;i<words.length;i++) {      
	          String word = words[i];
	          String reverseWord = "";
	      for (int j = word.length()-1;j >= 0;j--) {
	          reverseWord = reverseWord + word.charAt(j);
	          }
	           finalString = finalString + reverseWord + " ";
	       }
		   return finalString;
		}
public static void main(String args[]) {
	reverseWord obj =new reverseWord();
	String ans = obj.reverseString("Java Concept Of The Day ");
	System.out.println(ans);
}
}
