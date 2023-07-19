package stack;
import java.util.*;

public class stacka {
	
	public static void pushatb(Stack <Integer> a , int data) {
	if(a.isEmpty()) {
		a.push(data);
		return;
		
	}
		int top=a.pop();
		pushatb(a,data);
		
		a.push(top);
		System.out.println(a);
				
	}

	public static void main(String[] args) {
		Stack <Integer> a = new Stack<> ();
		
		a.push(1);
		a.push(2);
		a.push(3);
		// TODO Auto-generated method stub
		pushatb(a,4);

	}

}
