/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
frontTimes("Ch", 2) → "ChCh"
*/
/* PESUDOCODE:
string str="praga"

*/
package First;
public class frontTimes {
    public static void main(String args[]){
        frontTimes obj=new frontTimes();
        String str4 = obj.print("aABC#dds#dca#sdcaC",2);
        String str3 = obj.spliter("aABC#dds#dca#sdcaC");
        int value= obj.counter("xxxx");
        System.out.println(value);
    }
    
    String print(String str,int n){
        str=str.substring(0,3);
        String str2="";
        for(int i=0;i<n;i++){
            str2+=str;
        }
        return str2;
    }
    String spliter(String str){
        String arr[] =str.split("#");
        //aabc,dds,dca,sdcac
        String str3="";
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                str3+=arr[i];
            }
        }
        return str3;
        
    }
    int counter(String str){
         char arr[]=new char[str.length()];
         int count=0; //abcXXXX
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length();j++){
                if(arr[i]==arr[j]){
                 count++; //
                 break;
                }   
            }
        }
        return count;
    }
    
}
