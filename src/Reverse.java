import java.util.Arrays;

public class Reverse {
    public static void main(String[] args){
        int [] numbers = {1,2,3,4,5,6};
        int [] reverse = new int [6];
        int num = 0;
        for(int i = 3; i>=0; i--){
            reverse[num]= numbers[i];
            num++;

        }
        for(int j= 4; j<=5; j++){
            reverse[j] = numbers[j];
        }
        System.out.print(Arrays.toString(reverse));
    }
}
