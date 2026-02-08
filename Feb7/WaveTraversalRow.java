import java.util.*;

public class WaveTraversalRow {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4},
            {3, 5, 6, 7},
            {9, 12, 24, 35}
        };

        System.out.println(Arrays.deepToString(arr));
			
    
	
	
	for ( int j = 0 ; j < arr[0].length ; j++){
	  
	  if( j % 2 == 0 ){
		  
		  for ( int i = 0 ; i < arr.length ; i++){
			 System.out.print(arr[i][j] + " ");
		  }
		  
	  }
	  else {
		  for ( int i = arr.length - 1 ; i >= 0 ; i--){
			 System.out.print(arr[i][j] + " ");
			}
		}
	
	
	}		
		
}
}
