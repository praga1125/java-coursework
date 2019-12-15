package First;
public class vowels {
    public static void main(String [] args){
        String s ="encyclopedia";
        char n[] = {'a','e','i','o','u'};
        //int i1=0;
        //System.out.println(s.charAt(i1));
        for(int i=0;i<s.length();i++){
            for(int j=0;j<n.length;j++){
                    if(s.charAt(i) == n[j]){
                           System.out.println(s.charAt(i));
                           
                    }
            }
        }
}
}

// vowels => o,e  => e,o => a, e,i => i,e,o
