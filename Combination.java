public class Combination {
	String[] combinationString(String str) {
		String combinations[] = new String[str.length()*2];
		int n =str.length();
		int combinationIndex = 0;
		for(int i=0 ;i<=n ;i++) {
			for(int j=i+1;j<=n;j++) {
				if(!str.trim().isEmpty()) {
				combinations[combinationIndex]=str.substring(i,j);
				combinationIndex++;
				}
			}
		}
		return combinations;
	}
public static void main(String args[]) {
	Combination obj =new Combination();
	String str [] = obj.combinationString("pet");
	for(String combo: str) {
		System.out.print(combo + " ");
	}
}
}
