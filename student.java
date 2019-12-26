import java.util.*;
public class student {
	String student[];
	void addStudent(String name,String dept,String mark) {
		String student[] = new String[3];
		student[0] = name;
		student[1] = dept;
		student[2] = mark;
		System.out.println("DAta Inserted");
		this.student = student;
	}
	void viewStudent() {
		String student[] = this.student;
		System.out.print(student[0] +" - " + student[1] + " - "+ student[2]);
	}
public static void main(String args[]) {
	student obj = new student();
	
	Scanner sc = new Scanner(System.in);
	
	char ch ='y';
	while(ch == 'y') {
		System.out.println("Enter your choice: \n 1. Insert Data \n 2. View Data");
		int n = sc.nextInt();
		switch(n) {
		case 1 :
			obj.addStudent("praga","dct","90");
			break;
		case 2 :
//			System.out.println("View Student Triggered.");
			obj.viewStudent();
			break;
		default :
			System.out.println("please check the choice ");
		}
		System.out.println("press y - to continue");
		ch = sc.next().charAt(0);
	}
}
}
