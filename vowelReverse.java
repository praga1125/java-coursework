public class vowelReverse {
	void reverse(String words) {
		char vowels[] = {'a','e','i','o','u'};
		char reverse[] = words.toCharArray();
		char reversedVowels[] = new char[reverse.length]; 
		int reversedVowelsIndex = 0;
		for(int i = reverse.length-1;i >= 0; i--) {
			for(int j=0 ; j<vowels.length ; j++) {
				if(reverse[i] == vowels[j] ) {
					reversedVowels[reversedVowelsIndex] = reverse[i];
					reversedVowelsIndex++;
				}
			}
		}
		int arr = 0;
		for(int i = 0;i < reverse.length; i++) {
			boolean isVowel = false;
			for(int j=0 ; j<vowels.length ; j++) {
				if(reverse[i] == vowels[j] ) {
					System.out.print(reversedVowels[arr]);
					isVowel = true;
					arr++;
				}
			}
			if(!isVowel) {
				System.out.print(reverse[i]);
			}
		}
		
	}
public static void main(String args[]) {
	vowelReverse obj = new vowelReverse();
	obj.reverse("pragadeesh");
}
}
