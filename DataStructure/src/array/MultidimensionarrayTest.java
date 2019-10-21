package array;

public class MultidimensionarrayTest {

	public static void main(String[] args) {
		int[][][] multi = {
		                   {
		                    {1,2,3},
		                    {4,5,6},
		                    {7,8,9}
		                   }
		                  };
		
		
		/*for(int[][] a2 : multi) {
			for(int[] a1 : a2) {
				for(int item : a1) {
					System.out.print(item+" ");
				}
				System.out.println();
			}
			System.out.println();
		}*/
		int i,j,k;
		for(i=0; i<3; i++) {
			for(j=0; j< 3; j++) {
				for (k=0; k< 3; k++) {
					System.out.print(multi[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
