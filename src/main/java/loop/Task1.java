package loop;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.print("Введите число: ");
            int number = inputNumber.nextInt();
            i += number;
            if (number == -1)
            break;
        }
        System.out.println("Сумма всех введенных чисел = " + i);
    }
}
