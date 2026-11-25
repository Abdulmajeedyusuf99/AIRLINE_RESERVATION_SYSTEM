import java.lang.reflect.Array;
import java.util.Arrays;

public class Numbers {
    public static void main(String[] args){
        int [] array1 = {2,5,8,10,12,15};
        int [] array2 = {5,7,10,12,20,25};
        int [] array3 = new int [12];
        int num = 0;
//        int num2 = 6;

        for(int i =0; i<6; i++){
            array3[num] = array1[i];
            num++;
        }
        for(int j=0; j<6; j++){
            array3[num] = array2[j];
            num++;
        }
        System.out.print(Arrays.toString(array3));
    }
}
