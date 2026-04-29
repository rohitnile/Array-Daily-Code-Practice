package array;

public class MoveZeroEnd {

	public static void main(String[] args) {
		int arr[] = {1,0,4,5,0,8,0,7};
		
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[index]=arr[i];
				index++;
				
			}
		}
		
		while(index<arr.length) {
			arr[index] = 0;
			index++;
			
		}
		
		for(int num : arr) {
			System.out.println(num+ " ");
		}

	}

}
