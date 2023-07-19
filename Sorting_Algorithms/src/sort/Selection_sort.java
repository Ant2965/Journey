package sort;

public class Selection_sort {
	

	public static void select(int num[]) {
		for(int i=0;i<num.length-1;i++){
			int min = i;

			for(int j=i+1;j<num.length;j++) {
				if(num[min]>num[j]){
					min =j;					
				}
				
			}
			int temp = num[i];
			num[i]=num[min];
			num[min]=temp;
			
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}
	public static void main(String[] args) {
		int num[]= {2,1,1,9,2};
		select(num);

	}

}
