package TaskList2;

public class Task1 {
    public static void main(String[] args) {
        int userInput = 10;
        int currentNum = 0;
        // This is incorrect, again, run and test
        // the task is to print
        // 0 10
        // 1 9 ... etc

        // Not what it is currently printing, check yourself
        // and don't use the math library, if you think of using it now (not required)

        // also try using for loop as well
        while (currentNum <= userInput){
            System.out.println(currentNum + " " + (currentNum-userInput));
            currentNum ++;
        }
    }
}
