package array;

public class SumAverage {

	public static void main(String[] args) {
		int arr[] = {12,25,33,45};
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		double average = (double) sum / arr.length;
		
		System.out.println(average);

	}

}
