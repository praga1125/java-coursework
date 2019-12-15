package First;
public class count {
    public static void main(String args[]){
        String s =" netbeans";
        char n[] = {'a','e','i','o','u'};
        String sn ="";
        int count1 = 0;
        for(int i=0;i<s.length();i++){
           for(int j=0;j<n.length;j++){
               if(s.charAt(i) == n[j]){
                   sn += s.charAt(i);                
                   count1++;
            }                   
         }
        }
        int count =sn.length();
        System.out.println(count+ " - "+ count1);
   }
 }
    
    

