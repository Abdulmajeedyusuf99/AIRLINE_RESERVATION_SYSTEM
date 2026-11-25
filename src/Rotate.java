import java.util.Arrays;

public class Rotate {
    public static void main(String[] args){
        int [] input = {1,2,3,4,5};
        int [] output = new int[5];
        int counter = 0;

        for(int i =3; i<5; i++) {
//            System.out.print(input[i]+ " ");
            output[counter]= input[i];
            counter++;

        }

        for (int j = 0; j<3; j++){
            output[counter] = input[j];
            counter++;

        }
        System.out.print(Arrays.toString(output));
    }
}
