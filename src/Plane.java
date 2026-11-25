import java.util.Objects;
import java.util.Scanner;
public class Plane {

  public static boolean [] seats = new boolean[10];

    public static boolean  assignSeat(int start, int end){
        for(int count = start; count < end; count++){
            if(!seats[count]){
                seats[count] = true;
                System.out.println("Your seat number is "+ (count+1));
                return true;
            }


        }


        return false;


    }




    public static boolean assign(int input){

        switch (input) {
            case 1:
                if (assignSeat(0, 5)) {
                    System.out.println("You are boarding First class");
                    return true;


                } else {
                    System.out.println("First class seats are filled up");
                    System.out.print("Would you like to be placed in Economy: ");
                    Scanner input2 = new Scanner(System.in);
                    String choice = input2.next();
                    if (choice.equalsIgnoreCase("yes")) {

                        if (assignSeat(5, 10)) {

                            System.out.println("You are boarding Economy");
                            return true;
                        } else {
                            System.out.println("Economy is fully booked");
                        }

                    } else if (choice.equalsIgnoreCase("no")) {
                        System.out.println("Next flight leaves in 3 hours");
                    }

                    break;

                }


            case 2:

                if (assignSeat(5, 10)) {
                    System.out.println("You are boarding Economy");
                    return true;

                } else {
                    System.out.println("Economy Seats are filled up");
                    Scanner input2 = new Scanner(System.in);
                    System.out.print("Would you like to be placed in first class: ");
                    String choice = input2.next();


                    if (choice.equalsIgnoreCase("yes")) {
                        if (assignSeat(0, 5)) {
                            System.out.println("You are boarding First class");

                            return true;
                        } else {
                            System.out.println("First class is fully booked");
                        }

                    } else if (choice.equalsIgnoreCase("no")) {
                        System.out.println("first class is fully booked");
                    }

                }
                break;



        }     return false;

    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int option =  3;

        System.out.print("Enter 1 for First class, 2 for Economy or 0 to Exit: ");
        option = input.nextInt();
        while(option !=0){
            assign(option);
            System.out.print("Enter 1 for First class, 2 for Economy or 0 to Exit: ");
            option = input.nextInt();




        }
        System.out.println("Good bye");


    }


}
