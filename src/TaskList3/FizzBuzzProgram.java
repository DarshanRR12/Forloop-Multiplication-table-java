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
            String s = "";

            if (currentNumber % 3 == 0) s += "Fizz";
            if (currentNumber % 5 == 0) s += "Buzz";
            if (currentNumber % 7 == 0) s += "Bar";
            if (currentNumber % 9 == 0) s += "Boo";

            if (s.isEmpty()) System.out.println(currentNumber);
            else System.out.println(s);
        }
    }
}
