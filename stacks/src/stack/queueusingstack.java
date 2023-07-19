package stack;
import java.util.*;

public class queueusingstack {
	public static class queue{
		static Stack<Integer> s1 =new Stack<>();
		static Stack<Integer> s2 =new Stack<>();
		
		public static void add(int data) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			System.out.println(s1.push(data));

			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		public static void remove() {
			if(s1.isEmpty()) {
				System.out.println("Empty");
				return;
			}
			else {
				//s1.pop();
				System.out.println(s1.pop());
			}
		}

	}

	public static void main(String[] args) {
		queue a = new queue();
		a.add(43);
		a.add(4343);
		//System.out.println(a.remove());
	a.remove();
	a.remove();
	a.remove();
	a.add(69);
	a.remove();

	}

}
