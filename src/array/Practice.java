package array;

public class Practice {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 3, 5, 6, 7,7 };

		// reverse arr
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// sum of arr
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of arr is: " + sum);

		// large element

		int largest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest);

		// smallest element

		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);

		//count even & odd element
          
		int even = 0;
		int odd = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even nums are: "+even);
		System.out.println("Odd nums are: "+odd);
		
		//second largest element
		
		int large = arr[0];
		int secLarge = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<large) {
				secLarge=large;
			}
			if(arr[i]<secLarge && arr[i] != large) {
				secLarge = large;
			}
		}
		
		System.out.println("Second largest element is: "+secLarge);
		
		//Check arr is sorted or not
		
		boolean sort = true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				sort = false;
				break;
			}
		}
		
		if(sort){
			System.out.println("Array is sorted");
		}else {
			System.out.println("Not sorted");
		}
		
		//remove duplicate element
		
		for(int i=0; i<arr.length; i++) {
			boolean isDuplicate = false;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
