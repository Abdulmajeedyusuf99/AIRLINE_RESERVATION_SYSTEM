public class Board1 {
    public static void main(String[] args){
        int [][] array1 = {{1,2,3},{3},{4,5,6}};
        board(array1);

    }
    public static void board(int [][] array){
        for(int row= 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col]+ " ");
            }
            System.out.println();

        }
    }
}
