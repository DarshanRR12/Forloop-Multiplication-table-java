package TaskList1;

public class WarmUpTask3 {
    public static void main(String[] args) {
        int userInput = 10;
        for (int current = 0; current <= userInput; current++){
            if (current % 2 == 0)
                System.out.println(current + " group1");
            else
                System.out.println(current + " group2");
        }
    }
}
