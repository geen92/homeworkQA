package lesson3;

public class Task7 {
    public static void main(String[] args) {
        String seasonName = "winter";
        System.out.println(seasonName.equals("winter") || seasonName.equals("spring") || seasonName.equals("autumn") ? "it's cold" : "It's hot");
    }
}