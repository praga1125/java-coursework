public class UniqueString {
	public static void main(String args[]) {
		String uniqueString ="";
		String str = "praga ".replaceAll("\\s+","");

		char[] arr = str.toCharArray();
        for(int i=0;i< arr.length;i++) {
        if(!uniqueString.contains(arr[i]+"")) {
        	uniqueString += arr[i];
        }
        }
        System.out.println(uniqueString);
        // "linuxdstroaeb" =0
        // "linux distros are best"
        char[] uniqueStringArray = uniqueString.toCharArray();
        String stringOccurence[][] = new String[uniqueString.length()][uniqueString.length()];
        for(int i=0; i<uniqueStringArray.length;i++) {
            int count =0;
        	for(int j=0;j<arr.length;j++) {
        		if(uniqueStringArray[i] == arr[j]) {
        			count++;
        		}
        	}
//        	System.out.println("Count of "+ uniqueStringArray[i] + " is "+ count);
        	stringOccurence[i][0] = uniqueStringArray[i]+"";
        	stringOccurence[i][1] = count+"";
        }
	
	for(int i=0;i<stringOccurence.length;i++) {
//		for(int j=0;j<stringOccurence.length;j++) {
			System.out.print("Count of " + stringOccurence[i][0] + " is "+ stringOccurence[i][1] +"\n");
//		}
	}
}
}
