import java.util.Scanner;

public class Scanner_Input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a floating point value: ");
        double number = input.nextDouble();

        System.out.println("You entered: " + number);
    }
}
