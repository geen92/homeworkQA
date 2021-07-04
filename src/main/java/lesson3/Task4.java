package lesson3;/*
        Ввести с клавиатуры число.
        Если число положительное, то увеличить его в два раза.
        Если число отрицательное, то прибавить единицу.
        Если введенное число равно нулю, необходимо вывести ноль.
        В конце программа должна напечатать “DONE”
        Вывести результат на экран в формате:
        “Введенное число: 5”
        “Число после преобразований: 10”
        “DONE"
*/

import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        System.out.print("Введенное число: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 0) {
            System.out.println("Число после преоброзований: 0");
            System.out.println("DONE");
        } else if (i >= 1) {
            System.out.println("Число после преоброзований:" + i * 2);
            System.out.println("DONE");
        } else if (i <= -1) {
            System.out.println("Число после преоброзований:" + ++i);
            System.out.println("DONE"); }
    }
}
