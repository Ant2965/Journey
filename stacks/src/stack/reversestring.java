package stack;
import java.util.*;

public class reversestring {
	public static void reverse(String b) {
		Stack <Character> a = new Stack<>();
		
		int index =0;
		while (index < b.length()) {
			a.push(b.charAt(index));
			index++;
			
		}
		
		while(!a.isEmpty()){
			//a.pop();
			System.out.print(a.pop());
		
			
		}
		
		//System.out.println();
		

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse("abcccsssdd");

	}

}
