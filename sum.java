/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package First;
public class sum {
    public static void main(String args[]){
    int u=0;
    int s[]=new int[] { 10,20,10,20};
    int a[]={1,2,3,4};
    //int[] testArray1 = {1, 2, 3, 4, 5}; 
    //System.out.println(testArray1);Arrays.toString()
    //System.out.println(s);
    int evenSum = 0;
    int oddMinus = 0;
   for (int i=0;i<s.length;i++) {
       if (i%2 == 0){
            evenSum = evenSum  + s[i];
       }else{
        oddMinus = oddMinus - s[i];   
       }
    }           
    //System.out.print("evenSum:" + evenSum);
    //System.out.print("OddMinus:" + oddMinus);
    System.out.print(a[1]);
}
}

//sop('enter the no of elemtns in array')
//n=? sizeOfArray
//int a[] = new int[n];
//for(i;i<n;i++){
//System.out.print("enter the element:"+(i+1))
//a[i] = sc.nextInt()}
//c[n]

//int a[][] = new int[2][2];
//for(row=0;row<n){
//for(col){
//a[row][col] = 1
}
}

