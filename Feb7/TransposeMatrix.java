import java.util.*;


public class TransposeMatrix {
    public static void main(String[] args) {

        int [] [] arr = new int [3] [3];
        int count = 1 ;

        for(int i = 0 ; i < arr.length ; i++){
				System.out.println("Orignal");	
            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = count++;
			
				System.out.print(arr[i][j] + " ");
            }
			System.out.println("");
        }
				System.out.println("After Transpose ");				

		for ( int i = 0 ; i < arr.length ; i++){
		
			for(int j = i ; j < arr[0].length ; j++){
			
				int temp = arr[i] [j] ;
				
				arr [i] [j] = arr [j] [i];
				arr [j] [i] = temp ;
				
				
			}
			
		}
		
		
		for(int i = 0 ; i < arr.length ; i++){
			
			for (int j = 0 ; j < arr[0].length ; j++){
				
				System.out.print(arr[i][j] + " ");

			}
				System.out.println("");

}
				System.out.println(Arrays.deepToString(arr));

}
}
