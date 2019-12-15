package First;
public class strop {
    public static void main(String [] args){
        String str="he is good boy";
        String[] stray=str.split(" ");
        String temp = " "; 
         for (int i = 0; i < stray.length; i++) { 
            if (i == stray.length - 1) {
                temp = stray[i]+temp; 
  }
            else{
                temp = " " + stray[i] + temp;
  }
  }
         System.out.println(temp);      
    }
}
