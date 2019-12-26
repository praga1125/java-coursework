public class RemoveVowels {
	String consonents(String word) {
		char vowel[] = {'a','e','i','o','u'};
		String  result = "";
		char arr[] =word.toCharArray();
		for(int i=0;i<arr.length;i++) {
			boolean isVowels = false;
			for(int j=0;j<vowel.length;j++) {
				if (arr[i] == vowel[j]) {
					isVowels = true;
					break;
				}
			}
			if(!isVowels) {
				result += arr[i];
			}
		}
		return result;
	}
public static void main(String args[]) {
	RemoveVowels obj = new RemoveVowels();
	String word ="hello world";
	String ans = obj.consonents(word);
	System.out.print(ans+" ");
}
}
