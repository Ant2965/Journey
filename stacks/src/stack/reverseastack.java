package stack;
import java.util.*;
public class reverseastack {
	
	public static void pushatbottom( Stack <Integer> a, int top) {
		if(a.isEmpty()) {
			a.push(top);
			return;
		}
		
	int c=a.pop();
		pushatbottom(a,top);
		
		a.push(c);
		
	}
	
	public static void reverse(Stack<Integer> a) {

		if(a.isEmpty()) {
			return;
		}
		int top = a.pop();
	//	System.out.println(top);

		reverse(a);
		pushatbottom(a,top);



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

               Stack <Integer> a = new Stack<> ();
               a.push(1);
               a.push(2);
               a.push(3);
               System.out.println(a);
               reverse(a);

              System.out.println(a);

	}

}
	