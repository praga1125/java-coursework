public class combination {
	
//	const combinationOfString = (str) => {
//		  let newArr = []
//		  for(let i=0;i<=str.length;i++){
//		    for(let j=i;j<=str.length;j++){
//		      if(str.substring(i, j)){
//		        newArr.push(str.substring(i, j))
//		      }
//		    }
//		  }
//		  return newArr;
//		}
	//[ 'd', 'do', 'dog', 'o', 'og', 'g' ]
	String[] combinationOfString(String str) {
		String combinations[] = new String[str.length()*2];
		int combinationIndex = 0;
		int n = str.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(!str.trim().isEmpty()) {
					combinations[combinationIndex] = str.substring(i,j);
					combinationIndex++;
				}
			}
		}
		return combinations;
	}
	
public static void main(String args[]) {
	combination obj = new combination();
	String combinations[] = obj.combinationOfString("dog");
	for(String a : combinations) {
		System.out.println(a);
	}

//		const combinationString = combinationOfString('dog');
//		console.log(combinationString);
	

}
}
