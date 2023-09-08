package TaskList2;

public class Task1 {
    public static void main(String[] args) {
        int userInput = 10;
        int currentNum = 0;
        while (currentNum <= userInput){
            System.out.println(currentNum + " " + (currentNum-userInput));
            currentNum ++;
        }
    }
}
