package stack;

import java.util.Stack;

public class validparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "({[]})";
				
		Stack<Character> b =new Stack <>();
		
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			
			if(ch== '{' || ch== '[' || ch=='(') {
				
				b.push(ch);
				
			}
			else {
				if(b.isEmpty()) {
					System.out.println(" false");
				}
				if(b.peek() == '{' && ch=='}'  ||b.peek() == '[' && ch==']'  ||b.peek() == '(' && ch==')') {
					b.pop();
					
				}
				else {
					System.out.println(" false");
				}
			}
			
		}
		if(b.isEmpty()) {
			System.out.println(" true");
		}
		else{
			System.out.println(" false");

		}

				
	}

}
