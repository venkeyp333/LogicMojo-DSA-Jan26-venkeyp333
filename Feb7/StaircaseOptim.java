import java.util.*;

public class StaircaseOptim {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4},
            {3, 5, 6, 7},
            {9, 12, 24, 35}
        };

        System.out.println(Arrays.deepToString(arr));
		int target = 24;
		
		
		int i = 0 ; 
		int j = arr.length - 1;
		
		while ( i <arr.length && j >= 0){
			
			if ( target == arr[i][j]){
				System.out.println(arr[i][j] + " ans  found at " + "[ " +i + " " + j +"]");
				break;
				
			}
			
			else if ( arr[i][j] < target ){
			i++;
			}
			else {
			j--;
			}
			
		
		}
		
    }
		
}
