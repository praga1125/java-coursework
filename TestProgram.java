public class TestProgram {
	int result = 1;
	int factorial(int number) {
		result = result * number;
		if(number-1 >= 1) {
			factorial(--number);
		}
		return result;
	}
	void vowelsConsonents(String word) {
		char vowels[] = {'a','e','i','o','u'};
		int count1 = 0;
		int count2 = 0;
		String vowel =" ";
		String consonent =" ";
		for(int i=0; i<word.length(); i++) {
			boolean isVowel = false;
			for(int j=0; j<vowels.length;j++) {
				if(word.charAt(i) == vowels[j]) {
					vowel += word.charAt(i);
					count1++;
					isVowel = true;
					break;
				}
			}
			if(!isVowel) {
				
					consonent += word.charAt(i);
					count2++;	
			}
		}
			System.out.println(vowel+" - "+ count1 +" => vowels");
			System.out.println(consonent+" - "+ count2 +" => consonents");
	}
	void occurence(String word) {
		String uniqueString ="";
		int len = word.length();
		char words[] = word.toCharArray();
		for(int i=0;i<word.length();i++) {
		if(!uniqueString.contains(words[i]+"")) {
			uniqueString += words[i];
		}
		}
		char uniqueStringArray[] = uniqueString.toCharArray();
		String uniqueStringOccur[][]=new String[uniqueString.length()][uniqueString.length()];
		for(int i=0;i<uniqueStringArray.length;i++) {
			int count = 0;
			for(int j=0;j<len;j++) {
			if(uniqueStringArray[i] == words[j]) {
				count++;
			  }
			}
			uniqueStringOccur[i][0]=uniqueStringArray[i]+" ";
			uniqueStringOccur[i][1]=count+" ";
		}
		for(int i=0;i<uniqueStringOccur.length;i++) {
				System.out.println(uniqueStringOccur[i][0] +" - "+uniqueStringOccur[i][1]);
			
		}
	}
	
	public static void main(String args[]) {
		TestProgram obj1 =new TestProgram();
//		int ans1 = obj1.factorial(5);
//		System.out.println(ans1);
//		obj1.vowelsConsonents("aptitude");
		obj1.occurence("praga");
	}
}
