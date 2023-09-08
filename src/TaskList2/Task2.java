package TaskList2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int userInput = scan.nextInt();
        System.out.println("Factors of " + userInput + ": ");

        for(int currentInput = 1; currentInput <= userInput; currentInput++){
            if(userInput % currentInput == 0)
                System.out.println(currentInput);
        }

    }
}
