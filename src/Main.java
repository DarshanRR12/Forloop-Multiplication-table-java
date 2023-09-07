import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numberToReach = 10;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for desired Multiplication table : ");
        int userInput = scan.nextInt();

        for (int currentNumber = 1; currentNumber <= numberToReach; currentNumber++) {
            System.out.println(currentNumber * userInput);
        }
    }
}