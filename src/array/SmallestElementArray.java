package array;

public class SmallestElementArray {

	public static void main(String[] args) {
		int arr[] = { 21, 34, 56, 11, 45, 77, 5};

		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
             if(arr[i]<smallest) {
            	 smallest = arr[i];
             }
		}
		System.out.println(smallest);

	}

}
