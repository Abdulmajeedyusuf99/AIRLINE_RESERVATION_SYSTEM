import java.security.SecureRandom;
import java.util.Arrays;

public class ArcheryGame {
    public static int table [][] = new int[5][5];
    public static  int chance1Score= 0;
    public static  int chance2Score= 0;
    public static  int chance3Score= 0;

    public static void playGame(int player){
        if(player == 1){
            for(int i=0; i<3; i++){
                if(i == 0){
                    SecureRandom secureRandom = new SecureRandom();
                    chance1Score = 0 + secureRandom.nextInt(10);
                    table[1][0] = 1;
                    table[1][1] = chance1Score;

                }
                if(i == 1){
                    SecureRandom secureRandom = new SecureRandom();
                    chance2Score = 0 + secureRandom.nextInt(10);

                    table[1][2] = chance2Score;
                }
                  
            }
        }
    }
    public static void displayTable(){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("| ");
                System.out.print(table[i][j] );
                System.out.print(" | ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        playGame(1);
        ArcheryGame.displayTable();



    }


}
