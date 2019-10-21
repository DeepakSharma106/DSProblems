package array;

import java.util.Arrays;

public class ArrayRotation {
	
      public static void main(String[] args) {
		arrayRotation();
}
	private static void arrayRotation() {
		int[] array = {1,2,3,4,5,6,7};
		
		int[] newArray = new int[array.length];
		
		int rotate = 5;
		if(rotate > array.length || rotate < 0) {
			System.out.println("rotation value should be between zero and array length");
			return;
		}
			
		int i=0;
		for (i = 0; i < array.length-rotate; i++) {
			newArray[i+rotate] = array[i];
		}
		int left = array.length - i;
		int j = 0;
		while( j < left) {
			newArray[j] = array[i++];
			j++;
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray));
		
		
		
	}

}
