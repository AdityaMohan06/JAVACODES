package Arrays;

public class Arrays1 {
	
	public static void main(String[] args) {
		
		int rw=4;
		int col=4;
		int count=0;
		Integer array2D[][]=new Integer[rw][col];
		
		for(int temprow=0;temprow<rw;temprow=temprow+1){
			for(int tempcol=0;tempcol<col;tempcol=tempcol+1)
			{
				array2D[temprow][tempcol]=temprow+tempcol;
				//if(temprow==tempcol){
				//if(temprow<=tempcol)		
				//if(temprow>=tempcol)
				while(array2D[temprow][tempcol]==6)
				{		
				array2D[temprow][tempcol]=temprow+tempcol;
				System.out.print( "(" +  temprow  +","+ tempcol +")" + "=" + array2D[temprow][tempcol] );
			}//else{
				//System.out.print("      ");
			//}
			}
			System.out.println();
		}
	count++;
	
}
}
