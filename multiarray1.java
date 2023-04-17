package PracticePrograms;

public class multiarray1 {

	public static void main(String[] args) {
int arr[][]= {{1,2,3,16},{4,5,6,17},{7,8,9,18},{10,11,12,19},{13,14,15,20},{21,22,23,24}};
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<4; j++ ) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
