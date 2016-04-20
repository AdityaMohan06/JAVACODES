package Arrays;

public class ArrayMatrix {
	public static void main(String[] args) {
		
		int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<matrix.length;i=i+1){
			for(int j=0;j<matrix.length;j=j+1){
				System.out.print( matrix[i][j]+"  ");
			}
			System.out.println(   );
		}
	}

}
