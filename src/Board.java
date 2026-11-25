import java.util.Arrays;

public class Board {
    public static void main(String[] args){
        char [][] array = new char[3][3];

         for(int row =0; row < array.length; row++){
            for(int col = 0; col < array.length; col++){
                if(row == 0 && col == 0){

                    System.out.print("| "+'X' +" |");
                }
                if(row == 1 && col == 0){
                    System.out.print("| "+'O' +" |");
                }
                if(row == 2 && col == 2){
                    System.out.print("| "+'X' +" |");
                }
                if(row == 0 && col == 1){
                    System.out.print(" "+'O' +" |");
                }
                if(row == 0 && col == 2){
                    System.out.print(" "+'X' +" |");
                }
                if(row == 1 && col ==1 ){
                    System.out.print(" "+'X' +" |");
                }
                if(row == 1 && col == 2){
                    System.out.print(" "+'O' +" |");
                }
                if(row == 2 && col == 0){
                    System.out.print("| "+'X' +" |");
                }
                if(row == 2 && col == 1){
                    System.out.print(" "+'O' +" ");
                }


            }
            System.out.println();


        }


    }
}
