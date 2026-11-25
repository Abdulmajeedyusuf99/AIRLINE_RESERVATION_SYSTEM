public class ArrayMethod {

    public static int countArray(int[] array){
        int num =0;
        for(int i =0; i< array.length; i++){
            num++;
        }
        return num;
    }
    public static void main(String[] args){
        int [] numbers = new int [8 ];
        System.out.println(countArray(numbers));
    }
}
