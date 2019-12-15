/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;
import java.util.*;
import java.lang.*;
/**
 *
 * @author praga
 */
public class First {
    public static void main(String args[]){
        //float pi=3.14;
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        //String str = sc.next();
        //String strLine = sc.nextLine();
        //float pi = sc.nextFloat();
        double pi = 3.14;
        System.out.print(pi * radius * radius);
       String str="hello world";
      // char a = str.charAt(3);
       //System.out.println(a);
       //System.out.print((str.contains("hello")));
       //System.out.print(str.length());
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(i%2 != 0){
               System.out.print(ch);
           }
       }
       //int arr[] = new int[5];
       //char ch[] = str.toCharArray();
  //System.out.print(ch[1]);
     //  for(char c: ch){
           //System.out.print(c+" - ");
       }
    }
}
