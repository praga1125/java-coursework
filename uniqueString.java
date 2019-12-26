public class uniqueString {
	int  unique(String str) {
		int count =0;
		char s[] =str.toCharArray();
		for(int i=0;i<s.length;i++) {
			for(int j=0 ;j<s.length;j++) {
				if(s[i] == s[j]) {
					count++;
				}
			}
		
		System.out.println(count);
		}		
	}
public static void main(String args[]) {
	uniqueString obj = new uniqueString();
	obj.unique("hi am praga");
	
	
}
}
