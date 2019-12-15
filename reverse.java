/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;
import java.util.*;
import java.lang.*;

public class reverse {
public static void main(String [] args){ 
    String str1 ="abcb";
    
    String reversedString = "";
      for(int i =str1.length()-1;i>= 0 ;i--){
            reversedString = reversedString + str1.charAt(i);
            
      }
      System.out.println(reversedString);
      if(reversedString.equals(str1))
          System.out.print("Palindrome");
      } 

}

