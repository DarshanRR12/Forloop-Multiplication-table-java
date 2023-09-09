package TaskList3;

// Great, now try to implement "fizz buzz bar" 🙂
// if divisible by 3 Fizz
// if divisible by 5 Buzz
// if divisible by 7 Bar
// if divisible by 3 & 5 Fizz Buzz
// if divisible by 3 & 7 Fizz Bar
// if divisible by 5 & 7 Buzz Bar
// if divisible by 3 & 5 & 7 Fizz Buzz Bar

// This is not only a hardcore "if-else" puzzle
// this is actually a puzzle that makes you think
// how to write simpler code so that it can be extended

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
