package primenumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int userInput = scanner.nextInt();
        boolean flag = false;

        for (int i = 2; i <= userInput/2; i ++){
            if (userInput % 1 == 0) {
                flag = true;
            break;
            }
        }

        if (!flag)
            System.out.println(userInput + "is prime number.");
        else
            System.out.println(userInput + "is not prime number.");
    }
}
