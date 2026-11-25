import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<String>();
        items.add("red");
        items.add(0,"yellow");
        items.remove(1);


        display(items, "Removing object at index 0");

        for(int i =0; i <items.size(); i++){
            System.out.println(items.get(i));
        }


    }
    public static void display(ArrayList<String> items, String header){
        System.out.println(header);

        for(String item: items){
            System.out.println(item);
        }


    }
}
