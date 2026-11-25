import java.util.Arrays;

public class Element {
    public static void main(String[] args){
        int [] numbers = {2,7,11,15};
        int target = 9;

        for(int i=0; i <3; i++) {
            if(numbers[i] + numbers[i+1] == target){
                System.out.println(numbers[i] + " and " + numbers[i+1]);


            }

        }

    }
}
