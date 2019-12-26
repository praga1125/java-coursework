public class palindroma {
	String reverse(String words) {
     String reverseWord ="";	
     char array[] = words.toCharArray();
     for(int i=array.length-1;i >= 0;i-- ) {
    	 reverseWord += array[i];
	}
     return reverseWord;
}
 public static void main(String args[]) {
 palindroma obj = new palindroma();
 String str ="Rotor";
 String  ans = obj.reverse(str);
 if(str.equals(ans)) {
System.out.println(" this word is palindroma "+ans);
 }
 else {
	 System.out.println("this is not a palindroma  word "+ans);
 }
}
}