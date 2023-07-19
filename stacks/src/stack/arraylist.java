package stack;
import java.util.ArrayList;
public class arraylist {
	public static void pop(ArrayList<Integer> a) {
		//int first = a.get(a.size()-1);
		a.remove(a.size()-1);
		
		System.out.println(a);
		
		
	}
	
	public static void peeek(ArrayList<Integer> a) {
		
		int last = a.get(a.size()-1);
		
		System.out.println(last);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(434);
		a.add(324);
		a.add(44232);
		a.add(49383);
		a.add(5454);
		a.add(9083);
		
		System.out.println(a);
		//System.out.println(a.get(0));
		//System.out.println(a.remove(1));
		//System.out.println(a);
		peeek(a);
		pop(a);
		peeek(a);
		pop(a);
		peeek(a);



	}

}
