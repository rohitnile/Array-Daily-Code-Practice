package array;

public class SecLargest {

	public static void main(String[] args) {
		int arr[] = { 12, 45, 36, 75, 61 };

		int largest = arr[0];
		int secLarge = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				secLarge = largest;
				largest = arr[i];
			} else if (secLarge < arr[i] && arr[i] != largest) {
				secLarge = arr[i];
			}
		}

		System.out.println(secLarge);

	}

}
