import java.util.Scanner;

/**
 * Created by Zach on 1/3/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to:\n" +
                "1) run Fibonacci classic\n" +
                "2) provide your own numbers\n" +
                "3) option one + FizzBuzz\n" +
                "4) option two + FizzBuzz");
        String userInput = scanner.nextLine();


        switch (userInput) {
            case "1":
                System.out.println("How many iterations into Fibonacci do you want to run?");
                int userParam = Integer.parseInt(scanner.nextLine());
                Fibbo(userParam);
                break;
            case "2":
                System.out.println("How many iterations into Fibonacci do you want to run?");
                int param = Integer.parseInt(scanner.nextLine());

                System.out.println("What is your first number?");
                int n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("What is your second number?");
                int n2 = Integer.parseInt(scanner.nextLine());
                Fibbo(param, n1, n2);
                break;
            case "3":
                System.out.println("How many iterations into Fibonacci do you want to run?");
                int userParam2 = Integer.parseInt(scanner.nextLine());
                FibbBuzz(userParam2);
                break;
            case "4":
                System.out.println("How many iterations into Fibonacci do you want to run?");
                int param1 = Integer.parseInt(scanner.nextLine());

                System.out.println("What is your first number?");
                int N1 = Integer.parseInt(scanner.nextLine());
                System.out.println("What is your second number?");
                int N2 = Integer.parseInt(scanner.nextLine());
                FibbBuzz(param1, N1, N2);
                break;

        }

    }

    private static void Fibbo(int param) {
        int a = 1;
        int b = 1;
        int c;
        int counter = 0;
        System.out.println(a);
        System.out.println(b);

        while (counter < param) {

            c = a + b;
            a = b;
            b = c;

            System.out.println(c);
            counter++;
        }
    }

    private static void Fibbo(int param, int n1, int n2) {
        int a = n1;
        int b = n2;
        int c;
        int counter = 0;
        System.out.println(a);
        System.out.println(b);

        while (counter < param) {

            c = a + b;
            a = b;
            b = c;

            System.out.println(c);
            counter++;
        }
    }
    private static void FibbBuzz(int param) {
        int a = 1;
        int b = 1;
        int counter = 0;
        System.out.println(a);
        System.out.println(b);

        whileLoop(param, a, b, counter);

    }
    private static void FibbBuzz(int param, int n1, int n2) {
        int a = n1;
        int b = n2;
        int counter = 0;
        System.out.println(a);
        System.out.println(b);

        whileLoop(param, a, b, counter);
    }

    private static void whileLoop(int param, int a, int b, int counter) {
        int c;
        while (counter < param) {
            c = a + b;
            a = b;
            b = c;

            if(c % 3 == 0 && c % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (c % 3 == 0){
                System.out.println("Fizz");
            }else if (c % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(c);
            }
            counter++;
        }
    }
}
