package TaskList2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
            System.out.println(factorial);
        }
    }
}
