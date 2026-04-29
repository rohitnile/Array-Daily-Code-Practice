package array;

public class ReversArray {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		
		int start = 0;
		int end = num.length-1;
		
		while(start<end){
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
	
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		

	}

}
