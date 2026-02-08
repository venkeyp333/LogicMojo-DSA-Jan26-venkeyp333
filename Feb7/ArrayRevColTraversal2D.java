public class ArrayRevColTraversal2D {
    public static void main(String[] args) {

        int [] [] arr = new int [3] [3];
        int count = 1 ;

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = count++;
            }
        }

        for ( int i = arr.length -1 ; i >= 0 ; i --){
            for(int j = arr[0].length -1 ; j >= 0 ; j--){
				//System.out.println( i + "i");
				//System.out.println( j + "j");
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }


    }
}