package First;
public class highcount {
    public static void main(String args[]){
        String s= "hello this is netbeans";
        String [] word = s.split(" ");
        String count = "";
         for(int i=0;i<word.length;i++){
            if(word[i].length() >= count.length()){
                  count = word[i];
          } 
   }
     System.out.println(count);  
      }      
   }

