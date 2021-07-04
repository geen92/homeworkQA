package lesson3other;

public class Task_5 {

    public static void main(String[] args) {

        String result;
        String seasonName = "winter";

        result = ((seasonName.equals("winter")) || (seasonName.equals("spring")) || (seasonName.equals("autumn")))
                ? "It`s cold" : "It`s hot";
        System.out.println(result);

    }

}
