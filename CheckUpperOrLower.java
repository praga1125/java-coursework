public class CheckUpperOrLower {
public static void main(String arg[]) {
  String words = "hello Praga";
  int Asciivalue[] = new int[words.length()];
  char arr[] =words.toCharArray();
  for(int i=0;i<arr.length;i++) {
	   Asciivalue[i] = (int) arr[i];
	   if(Asciivalue[i]>=65 && Asciivalue[i]<=90) {
		   System.out.println((char)Asciivalue[i] +" this is uppercase");
		   
	   } else if(Asciivalue[i]>=97 && Asciivalue[i]<=122) {
		   System.out.println((char)Asciivalue[i]+" this is lowercase");
		  
	   } else {
		   System.out.println("this is special character");
	   }
}
}
}