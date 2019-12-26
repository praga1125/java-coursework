public class Arrayremove {
	 int[] removeElement(int number[],int index) {
		 int newArray[] = new int[number.length-1];
		 int count = 0;
		 for(int i=0;i<number.length;i++) {
//		 System.out.print(number[i]+ " # ");
//		 System.out.println();
		   if(i != index) {
			   newArray[count] = number[i];
//			   System.out.print(number[i]+ " - ");
			   count++;
		   }
		 }
		 return newArray;
		 
	 }
public static void main(String args[]) {
	Arrayremove obj =new Arrayremove();
	int numbers[] = {1,2,3,4,5};
	int index = 1;
	int[] result = obj.removeElement(numbers,index);
	for(int i=0;i<result.length;i++) {
	System.out.print(result[i]+" ");
	}
}
}
