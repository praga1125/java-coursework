import java.util.*;
public class Arrayadd {
int[] addArrayElement(int initialArray[],int index, int value) {
	int newArray[] = new int[initialArray.length + 1];
	int oldArrayIndex = 0;
	for(int i=0;i<newArray.length;i++) {
		if(i == index) {
			newArray[i] = value;
		} else {
			newArray[i] = initialArray[oldArrayIndex];
			oldArrayIndex++;
		}
	}
	return newArray;
}//1 2 3 4 => 1 10 2 3 4
public static void main(String args[]) {
	Arrayadd obj = new Arrayadd();
	int initialArray[] = {1,2,3,4,5};
	int index = 3;
	int value = 31;
	int result[] = obj.addArrayElement(initialArray, index, value);
	for(int i=0;i<result.length;i++) {
		System.out.print(result[i] + " - ");
	}
}
}
