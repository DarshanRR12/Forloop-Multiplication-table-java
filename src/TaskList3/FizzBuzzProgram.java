package TaskList3;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        int userInput = 100;
        for (int currentNumber = 0; currentNumber <= userInput; currentNumber++){
            if ( currentNumber % 3 == 0 && currentNumber % 5 == 0){
                System.out.println("Fizzbuzz");
            } else if (currentNumber % 3 == 0) {
                System.out.println("Fizz");
            } else if (currentNumber % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(currentNumber);
        }
    }
}
