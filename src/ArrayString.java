import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args){
        String [] names = new String[2];
        String [] realNames = new String[2];
        for(int i =0; i<2; i++){
            java.util.Scanner input = new java.util.Scanner(System.in);
            System.out.print("Enter name: ");
            String name = input.next();
            names[i] = name;
            realNames[i] = names[i];

        }
        System.out.println(Arrays.toString(realNames));

    }
}
