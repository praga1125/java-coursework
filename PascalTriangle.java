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
import java.util.*;
public class PascalTriangle {
    public static void main(String args[])
	{
	    int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		r =5;
		for(i=0;i<5;i++)
		{
                    //Space
                    for(k=5; k>i; k--) //4>1 
                    {
                        System.out.print(" ");
                    }
                    number = 1;
			for(j=0;j<=i;j++)
			{
                            System.out.print(number+ " ");
                            number = number * (i - j) / (j + 1); //1 * 0 
			}
			System.out.println();
		}
	}
}

//n=?
//for(int i=0;i<n;i++){
//    11^i // 1,11,121,1331
//}
/*
    1 
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
*/