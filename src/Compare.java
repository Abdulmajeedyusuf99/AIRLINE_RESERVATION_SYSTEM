import java.lang.reflect.Array;
import java.util.Arrays;

public class Compare {
    public static void main(String[] args){
        int [] num1={2,5,8,10,12,15};
        int [] num2={5,7,10,12,20,25};
        for(int i =0; i<6; i++){
           for(int j= 0; j<6; j++){
               if(num1[i] == num2[j]){
                   System.out.print(num1[i]+" ");

               }
           }
        }

    }
}
