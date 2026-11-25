import java.util.Arrays;

public class Label {
    public static void main(String[] args){
        int [][] table = new int[5][6];
        for (int row=0; row< 5; row++ ){
            for(int col= 0; col< 6; col++){
                table[row][col] = 0;
                System.out.print(table[row][col]+ " ");
            }
            System.out.println();

        }


    }
}
