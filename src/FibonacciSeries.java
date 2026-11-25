public class FibonacciSeries {
    public static int first = 0;
    public static int second = 1;
    public static int fibonacci(int n){

        for(int i=0; i< n; i++){
            int next = first + second;
            first = second;
            second = next;
            System.out.print(first+ ", ");



        }
        return first;

    }
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        fibonacci(number);
        System.out.println("...");
        System.out.println("The largest number is: "+ first);
    }
}
