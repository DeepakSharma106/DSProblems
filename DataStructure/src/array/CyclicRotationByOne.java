package array;

import java.util.Arrays;

public class CyclicRotationByOne {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		
		int[] newArray = new int[array.length];
		
		int last = array[array.length-1];
		
		for (int i = 0; i < array.length-1; i++) {
			newArray[i+1] = array[i];
		}
		
		newArray[0] = last;
		System.out.println(Arrays.toString(newArray));

	}

}
