package TaskList1;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number : ");
        int userInput = scanner.nextInt();

        for (int num = userInput; num >= 0; num --){
            if (num % 2 == 0){
                System.out.println(num + " Triplet");
            } else {
                System.out.println(num);
            }
        }
    }
}
