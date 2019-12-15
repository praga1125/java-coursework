package First;
public class stringTimes {
public static void main(String args[]){
   stringTimes obj=new stringTimes();
    String newString = obj.printer("praga",3);
    System.out.println(newString);
}
String printer(String str, int n){
    String str2="";
    for(int i=0;i<n;i++){
        str2 += str;
    }
    return str2;
}
}
//newString=""
//for(n times)
//print('ABC', 3)
//ABCABCABC
//newString+=str;