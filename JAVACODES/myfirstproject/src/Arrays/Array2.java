package Arrays;

public class Array2 {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		int rw=4;
		int col=4;
		Integer array[][]=new Integer[rw][col];
		int temprow=0;
		for(int tempcol=0;tempcol<=col;tempcol=tempcol+1){
				
			array[temprow][tempcol]=temprow+tempcol;
				System.out.println( "(" +  temprow  +","+ tempcol +")" );
				int tempcol1=3;
       for(temprow=0;temprow<=rw ;temprow++){
    	   
    	   array[temprow][tempcol1]=temprow+tempcol1;
			System.out.print( "(" +  temprow  +","+ tempcol1 +")" );
		
       }
       break;
		
		}
		
		//for(int temprow1=1;temprow1<=3;){
					//int tempcol1=3;
					//array[temprow1][tempcol1]=temprow1+tempcol1;
					//System.out.print( "(" +  temprow1  +","+ tempcol1 +")" );
				
		        //}
								}
		}



	
		
		
	


