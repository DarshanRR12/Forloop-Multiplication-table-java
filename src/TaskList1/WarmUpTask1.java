package TaskList1;

public class WarmUpTask1 {
    public static void main(String[] args) {
        int userInput = 10;

        for (int currentNumber = 0; currentNumber <= userInput; currentNumber ++){
            if (currentNumber == userInput)
                System.out.println(currentNumber + " Hooray last");
            else
                System.out.println(currentNumber);
        }
    }
}

