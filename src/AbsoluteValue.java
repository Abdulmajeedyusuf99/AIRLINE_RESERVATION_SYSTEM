import java.util.Arrays;

public class AbsoluteValue {
    public static void absoluteValues(int [] array){
        int [] num = new int [array.length];

        int count = 0;
        for(int i : array){

            num[count] = Math.abs(i);
            count++;

        }
        System.out.print(Arrays.toString(num));
    }
    public static void main(String[] args){
        int [] numbers = {-1,2,3,4,-5};
        absoluteValues(numbers);
    }
}
