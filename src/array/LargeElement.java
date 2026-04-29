package array;

public class LargeElement {

	public static void main(String[] args) {
		int num[] = {23,245,46,86,56,33,112};
		int largest = 0;
		
		for(int i=0; i<num.length; i++) {
			if(largest<num[i]) {
				largest=num[i];
			}
		}
		System.out.println(largest);
	}

}
