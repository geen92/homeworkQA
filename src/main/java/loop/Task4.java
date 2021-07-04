package loop;

public class Task4 {
    public static void main(String[] args) {

        String letter  = "A";
        for (int j = 0; j < 5; j++, letter = letter + "A") {
            {
                System.out.print(letter);
            }
                System.out.println();
        }
    }
}
