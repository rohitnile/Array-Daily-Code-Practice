package array;

public class CountEvenOddArray {

	public static void main(String[] args) {
		int arr[] = {2,5,7,6,4,8,3,3,66,78};
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
         System.out.println(count);
	}

}
