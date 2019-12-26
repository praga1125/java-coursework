import java.util.*;
public class StackExample {
public static void main(String args[]) {
	Stack st = new Stack() ;
	System.out.println(st);
	st.push(13);
	st.push(43);
	st.push(23);
	System.out.println(st);
	st.pop();
	st.push(23);
	st.push(23);
	st.push(23);
	System.out.println(st.empty());
	System.out.println(st.peek());
	System.out.println(st);
	System.out.print(" - "+st.search(13));
}
}
