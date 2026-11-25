import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args){
        int [] numbers = {7,8,12,20,10,9};
        int [] output = new int[2];
        int num = 0;
        for(int i=0; i<6; i+=3){
            output[num] = numbers[i]+numbers[i+1]+numbers[i+2];
            num++;

        }
        System.out.print(Arrays.toString(output));
        
    }
}
