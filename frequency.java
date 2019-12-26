public class frequency {
	void stringFrequency(String word) {
		int[] frequency =new int[word.length()];
		char arr[] =word.toCharArray();
     for(int i = 0; i <word.length(); i++) {  
	      frequency[i] = 1;  
	   for(int j = i+1; j <word.length(); j++) {  
         if(arr[i] == arr[j]) {  
            frequency[i]++; 
            arr[j] = '0';
	}
	}
	}
     for(int i = 0; i <frequency.length; i++) {  
         if(arr[i] != ' ' && arr[i] != '0')  
             System.out.println(arr[i] + "-" + frequency[i]);  
     }
	}
public static void main(String args[]) {
	frequency obj =new frequency();
	String word ="pragadeesh";
	obj.stringFrequency(word);
}
}