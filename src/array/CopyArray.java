package array;

public class CopyArray {
      public static void main(String[] args) {
    	  int num1[] = {1,2,3,4,5};
    	  int num2[] = new int [num1.length];
    	  
    	  for(int i=0; i<num1.length; i++) {
    		  num2[i]=num1[i];
    	  }
    	  
    	  for(int i=0; i<num2.length; i++) {
    		  System.out.println(num2[i]);
    	  }
    	  
    	  System.out.println();
    	  System.out.println();
    	  
    	  //by clone method
    	  
//    	  int arr1[] = {1,2,3,4};
//    	  int arr2[] = arr1.clone();
//    	  
//    	  for(int i=0; i<arr2.length; i++) {
//    		  System.out.println(arr2[i]);
//    	  }
    		  
    			  
      }
      
}
