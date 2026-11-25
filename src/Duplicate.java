import java.util.Arrays;
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] numbers ={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int num = 0;
        int count =0;
        boolean duplicate = false;


        for(int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            num = input.nextInt();


            for (int x = 0; x < count; x++){

                if (numbers[x] == num){
                    duplicate = true;
                    break;

                }
                duplicate = false;
            }

            if (duplicate == false){
                numbers[count] = num;
                count++;
            }
        }


        for(int j= 0; j < 10; j++){
            if (numbers[j] != -1){

            }
            System.out.print(numbers[j]+" ");

        }

    }
}
