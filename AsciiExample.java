public class AsciiExample {
//	String encryptedPassword = encryptPassword(String actualPassword){}
//	String actualPassword = decryptPassword(String encryptedPassword){}
public static void main(String args[]) {
	char ch ='C';
	int Ascii = (int)ch;
	System.out.println(Ascii);
	int num =65;
	char ch1 =(char)num;
	System.out.println(ch1);
	String name ="vignesh";
	String newName ="";
	char name1[] = name.toCharArray();
	for(int i=0;i<name1.length;i++) {
	int Ascii2 =(int)name1[i]+3;
	newName += (char)Ascii2;
	}
	System.out.println(newName);
	System.out.println((int)'\\'-3 + " -> "+ (char)89);
	

}
}
