package TaskList1;

public class WarmUpTask1 {
    public static void main(String[] args) {
        int userInput = 10;

        for (int currentNumber = 0; currentNumber <= userInput; currentNumber ++){
            // this can be done using the index, since we can't always know what the last number will be
            // ofc in this case we do, so this is fine, just a thing to note
            if (currentNumber == userInput)
                System.out.println(currentNumber + " Hooray last");
            else
                System.out.println(currentNumber);
        }
    }
}

