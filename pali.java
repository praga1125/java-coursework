
package First;
public class pali {
    public static void main(String args[] ){
        String str="abcba";
        String reverse= "";
        char sn[]=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+sn[i];//""+e
            
        }
        if(str.equals(reverse)){
            System.out.println(reverse+"is  a palindrome ");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
    
}
