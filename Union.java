public class Union {
	int[] combine(int num1[],int num2[]) {
		int len = num1.length + num2.length;
		int num3[] = new int[len];
		int k = 0;
		int s=0;
		for(int i=0;i<num1.length;i++) {
			  num3[k] = num1[i];
			  k++;
				}
				for(int j=0;j<num2.length;j++) {
					num3[k] = num2[j];
					k++;
				}
		return num3;
	}
    void intersect(int num1[],int num2[],int size1,int size2) {
       int  i = 0; int j = 0;
       while (i < size1 && j < size2) {
       if (num1[i]> num2[j]) {
    	   j++;
       }
       else if(num2[j]>num1[i]) {
    	   i++;
       }
       else { 
    	   System.out.print(num1[i] + " ");
           i++; 
           j++;
       }
       }
       System.out.println( " are the intersection of array ");
     }
public static void main(String args[]) {
	Union obj = new Union();
	int num1[] = {1,2,3,4};
	int num2[] = {3,4,5};
	int size1 = num1.length;
	int size2 = num2.length; 
	int ans1[] = obj.combine(num1,num2);
	obj.intersect(num1,num2,size1,size2);
	System.out.print("The union of array is ");
	for (int i=0;i<ans1.length;i++) {
		  System.out.print(ans1[i]+" ");
	}
}
}

