/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;

/**
 *
 * @author praga
 */
public class GreatestOfNnumbers {
    public static void main(String args[]){
        int arr[]={11,23,59,3400,45,17};
        int great=0;
        for(int i=0;i<arr.length;i++){
            if(great<arr[i]){ 
                great = arr[i];
               
            }
        }
        System.out.println(great);
    }
}

/*
a = [13,22,5,15]

greatestNumber = 0

for(int i=0;i<a.length; i++){
if(greatestNumber < a[i]){ // 13,22,5,15
    greatestNumber = a[i];
}
}
*/