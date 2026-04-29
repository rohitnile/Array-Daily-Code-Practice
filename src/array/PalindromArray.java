package array;

public class PalindromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2, 1 };
		
		boolean isPalindrom = false;
		
		for(int i=0; i<arr.length/2; i++) {
			if(arr[i] == arr[arr.length-1-i]){
				isPalindrom = true;
				break;
			}
		}
		
		if(isPalindrom) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
		
	}

}
