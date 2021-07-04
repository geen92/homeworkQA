package loop;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //        Вариант А
        //        int m = 2;
        //        int n = 4;

        //        Вариант Б
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите вертикальное значение: ");
        int m = inputNumber.nextInt();
        System.out.print("Введите горизонтальное значение: ");
        int n = inputNumber.nextInt();

        String eight  = "8";
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(eight);
            }
                System.out.println();
        }
    }
}
