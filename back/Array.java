//package backtracking;

public class Array {
	public static void change(int num[],int i,int val) {
		if(i==num.length) {
			print(num);
			return;
		}
		
		num[i]=val;	
		change(num,i+1,val+1);
		
		num[i]=num[i]-2;
		
		
		
		
	}
	
	public static void print(int num[]) {
		for(int i=00;i<num.length;i++) {
			System.out.print(num[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int num[] = new int[5];
		change(num,0,1
				);
		
		print(num);
		

	}

}
