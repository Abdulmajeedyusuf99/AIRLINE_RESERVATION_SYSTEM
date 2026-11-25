import java.util.Arrays;

public class One {
    public static void main(String [] args){
//        int [] numbers = {10,11,12,13,14,15,16,17,18,19,20};
//        int [] array = new int[11];
//        for(int i=0; i<11; i++){
//            array[i] = numbers[i]*2;
//
//        }
//        System.out.print(Arrays.toString(array));

        int [] numbers = {4,5,6,10,11};
        int total = 0;
        for(int i: numbers){
            total += i;

        }
        System.out.print(total);
    }
}
