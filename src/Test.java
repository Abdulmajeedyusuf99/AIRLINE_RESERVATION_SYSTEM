import java.sql.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
//        int [] numbers = {1,5,4,3,2};
//        Arrays.sort(numbers);
////        System.out.print(Arrays.toString(numbers));
//        System.out.printf("%ndoubleArray: ");
//
//        for(int i: numbers){
//            System.out.print(i);
//        }

        int [] numbers = new int[5];
        Arrays.fill(numbers,1);
        System.out.println(Arrays.toString(numbers));
        for(int i: numbers){
            System.out.print(i);
        }
        int [] arrayS = {1,2,3,4,5,6,7};
        int [] arrayCopy = new int[arrayS.length];
        System.arraycopy(arrayS,0,arrayCopy,0,arrayS.length);
        System.out.println(Arrays.toString(arrayS));
        System.out.println(Arrays.toString(arrayCopy));

        boolean b = Arrays.equals(arrayS,arrayCopy);
        System.out.printf("%n%nArrays %s Arraycopy%n",(b ?"==" :"!="));

        int location = Arrays.binarySearch(arrayS,1);
        if (location >=0){
            System.out.println(location);
        }


    }

}
