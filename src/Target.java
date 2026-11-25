public class Target {
    public static int number(int [] array, int target){
        int num =0;
        for(int i =0; i < array.length; i++){
            if(array[i] == target){
                num = i;

            }

        }
        return num;
    }
    public static void main(String[] args){
        int [] num = {1,2,3,4,5,2};
        System.out.print(number(num,2 ));

    }
}
