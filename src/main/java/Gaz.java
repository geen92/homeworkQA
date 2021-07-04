import java.util.Scanner;
public class Gaz {
    public static void main(String[] args) {
        System.out.print("Сколько бензина должен кушать двигатель на 100 км. по тех паспорту?: ");
        Scanner inputBenz = new Scanner(System.in);
        double benz = inputBenz.nextDouble();
        double gaz = benz * 1.2;
        System.out.print("Количество газа на 100 км. = " + gaz + " л.");
    }
}
