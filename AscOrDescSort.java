public class AscOrDescSort {
 public static void main(String[] args) {
   int[] arr = new int[] {7,2,3,4,5,22,7,8,1};
     for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
          int tmp = 0;
	        if (arr[i] > arr[j]) {
             tmp = arr[i];
             arr[i] = arr[j];
             arr[j] = tmp;
	          }
	       }
//        System.out.println(arr[i]);
	   }
     
     for (int i = arr.length-1; i >= 0; i--) {
         for (int j = arr.length-1; j >= i+1; j--) {
           int tmp = 0;
 	        if (arr[j] > arr[i]) {
              tmp = arr[j];
              arr[j] = arr[i];
              arr[i] = tmp;
 	          }
 	       }
//         System.out.println(arr[i]);
 	   }
     for (int k : arr) {
    	 System.out.print(k + " - ");
     }
  }


}
