package TaskList2;

import java.util.Scanner;

// The code is correct but try putting in a value like 20
// The real answer of that is 2432902008176640000
// see what the output in the console is, can you guess why?

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
            // why are you printing it again and again?
            // printing the actual value of the factorial is enough

            // input = 5
            // output = 120
            // good enough
            System.out.println(factorial);
        }
    }
}
