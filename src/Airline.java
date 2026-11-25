import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Airline {
    public static boolean [] seats = new boolean[10];
    public  static boolean occupied = false;
    public static void main(String[] args){


        System.out.println(Arrays.toString(seats));
        Scanner input = new Scanner(System.in);
        int option =0 ;
        String option2 = " ";
        String option3 = " ";
        System.out.print("Enter 1 for first class or 2 for economy: ");
        option = input.nextInt();
        while (option != 3){




            if(option == 1) {

                for (int i = 0; i < 10; i++) {
                    if (seats[i] == false) {
                        System.out.println("your seat number is: " + (i + 1));
                        System.out.println("You are boarding FirstClass");
                        seats[i] = true;
                        System.out.println(Arrays.toString(seats));

                        break;

                    }

                    if(i ==4 ){
                            System.out.print("will you like to be placed in Economy:   ");
                            option2 = input.next();

                    }

                    if(Objects.equals(option2, "Yes")) {
                        for (int j = 5; j < 10; j++) {

                                if (seats[j] == false) {
                                    System.out.println("your seat number is: " + (j + 1));
                                    System.out.println("You are boarding Economy");
                                    seats[j] = true;

                                    System.out.println(Arrays.toString(seats));

                                    System.out.print("Enter 1 for first class or 2 for Economy: ");
                                    option = input.nextInt();

                                    System.out.print("will you like to be placed in Economy:   ");
                                    option2 = input.next();


                                }








                        }





                    } else if (Objects.deepEquals(option2, "No")) {
                        System.out.println("Next flight leaves in 3 hours.");


                        break;

                    }





                }



            }if(option == 2){


                for(int i = 5; i< 10; i ++){
                    if(false == seats[i]){

                        System.out.println("your seat number is: " + (i+1));
                        System.out.println("You are boarding Economy");
                        seats[i] = true;

                        System.out.println(Arrays.toString(seats));
                        break;

                    }

                    if(i == 9 ){
                        System.out.print("will you like to be placed in First Class: ");
                        option3 = input.next();
                    }
                    if(Objects.equals(option3, "Yes")){
                        for(int k = 0; k< 5; k++) {
                            if(seats[k] == false) {
                                System.out.println("your seat number is: " + (k +1));
                                System.out.println("You are boarding FirstClass");
                                seats[k] = true;

                                System.out.println(Arrays.toString(seats));

                                System.out.print("Enter 1 for first class or 2 for economy: ");
                                option = input.nextInt();

                                System.out.print("will you like to be placed in FirstClass:   ");
                                option2 = input.next();




                            }







                        }



                    } else if (Objects.equals(option3, "No")) {
                        System.out.println("Next flight leaves in 3 hours.");

                        break;

                    }


                }




            }

                System.out.print("Enter 1 for first class or 2 for economy: ");
                option = input.nextInt();




        }





    }
}
