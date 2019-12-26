public class reverseString {
public static void main(String args[]) {
	String  name ="hello my name praga";
	String Newstring = name.replaceAll("\\s+","");
	String reversed =" ";
	for(int i=Newstring.length()-1; i >= 0;i--) {
		reversed += Newstring.charAt(i); 
	}
	System.out.println(reversed);
}
}
