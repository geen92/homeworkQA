package lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите Ваш бал: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 0) {
            System.out.println("Очень плохо, ноль!");
        } else if (i > 0 && i <= 49) {
            System.out.println("Потрачено!");
        } else if (i > 50 && i <= 59) {
            System.out.println("1");
        } else if (i > 60 && i <= 69) {
            System.out.println("2");
        } else if (i > 70 && i <= 79) {
            System.out.println("3");
        } else if (i > 80 && i <= 89) {
            System.out.println("4");
        } else if (i > 90 && i <= 99) {
            System.out.println("5");
        } else if (i == 100) {
            System.out.println("Невероятно!!!");
        } else {
            System.out.println("Некорректные данные");
        }
    }
}

