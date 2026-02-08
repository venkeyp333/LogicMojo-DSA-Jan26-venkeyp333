public class ArrayRowTraversal2D {
    public static void main(String[] args) {

        int [] [] arr = new int [4] [4];
        int count = 0 ;

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = count++;
            }
        }

        for ( int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }


    }
}