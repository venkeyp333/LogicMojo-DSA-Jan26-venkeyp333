public class ArrayColTraversal2D {
    public static void main(String[] args) {

        int [] [] arr = new int [3] [3];
        int count = 1 ;

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = 0 ; j < arr[0].length ; j++){
                arr[i][j] = count++;
            }
        }

        for ( int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }


    }
}