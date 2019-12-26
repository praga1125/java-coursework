import java.util.*;
public class CheckNotes {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the amount to check the count notes :");
	int rupees =sc.nextInt();
	int notes[] = {2000,500,200,100,50,20,10,5,2,1};
	int count = 0 , totalNotes = 0;
	for(int i=0;i<notes.length;i++) {
		count=rupees/notes[i]; 
		if(count!=0) 
		{
			System.out.println(notes[i]+" x "+count+" = "+notes[i]*count);
		}
		totalNotes=totalNotes+count; 
		rupees=rupees%notes[i]; 
		
	}
	System.out.println("the total number of notes "+ totalNotes);
	 
}
}
