public class ClassExample {
	int num1, num2;
	ClassExample(int num1 ,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int add() {
		return this.num1 + this.num2; 
	}
	
	int sub() {
		return this.num1 - this.num2;
	}
	
public static void main(String args[]) {
	ClassExample obj =new ClassExample(3,4);
	ClassExample obj2=new ClassExample(22 , 11);
	ClassExample obj3=new ClassExample(1,3);
	int object1Sum = obj.add();
	int obj2Sum = obj2.add();
	System.out.println(object1Sum +" - "+ obj2Sum );
}
}
