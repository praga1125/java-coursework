public class A {
public static void main(String args[]) {
	B obj =new B(11,22);
	B obj2 = new B(22,33);
	B obj3 = new B(11,33);
	obj.sum();
	obj2.sum();
	obj3.sum();
}
}
class B{
	int number1 , number2;
	B(int num1,int num2) {
		this.number1=num1;
		  this.number2 =num2;
	}
	void sum() {
		System.out.println(this.number1+this.number2);
	}
}
