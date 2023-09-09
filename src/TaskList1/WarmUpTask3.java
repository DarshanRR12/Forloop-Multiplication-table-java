package TaskList1;

public class WarmUpTask3 {
    public static void main(String[] args) {
        int userInput = 10;
        for (int current = 0; current <= userInput; current++){
            // can you try to do this via ternary?
            // possibly since the only thing that is changing is "group1" or "group2"
            if (current % 2 == 0)
                System.out.println(current + " group1");
            else
                System.out.println(current + " group2");
        }
    }
}
