public class recursiveOdd {
	   int greaterEven = 0;
	   int greaterOdd = 0;
	   
	int oddEven(int Array[],int totalCount) {
//		System.out.println("Total Count: "+ totalCount);
//		System.out.println((totalCount >= 0)+" - "+ (Array[totalCount]%2 == 0));
		if(totalCount >= 0) {
			if(Array[totalCount] > greaterEven && Array[totalCount]%2 == 0 ) {
				greaterEven = Array[totalCount];
			}			
			if(Array[totalCount] > greaterEven && Array[totalCount]%2 == 1 ) {
				greaterOdd = Array[totalCount];
				System.out.println(greaterOdd);
			}
			oddEven(Array,--totalCount);
		}
		return greaterEven;
			
	}
public static void main(String args[]) {
	recursiveOdd obj = new recursiveOdd();
	int array[]= {10,2,3,4,5};
	int Ans = obj.oddEven(array, array.length-1);
    System.out.println(Ans);
}
}

// [11,22,2,1,4,66]
//[[11,1],[22.2.4.66]]