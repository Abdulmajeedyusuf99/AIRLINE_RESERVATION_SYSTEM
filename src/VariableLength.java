public class VariableLength {

    public static int average(int... numbers){
        int total = 0;
        for(int i: numbers){
            total += i;
        }
        return   total / numbers.length;
    }
    public static void main(String[] args){

        System.out.print(average(10,20,30,40,50,60,70,80,90,100));
    }
}
