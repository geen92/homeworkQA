package lesson3;/*
Ввести с клавиатуры число.
Написать программу, которая по номеру месяца определяет время
года (зима, весна, лето, осень) и вывести на экран.
Если число меньше 1 и больше 12, то вывести “Нет такого времени
года”
Например, если введенное число = 1, то нужно вывести “зима”
Например, если введенное число = 5, то нужно вывести “весна”
*/

import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        System.out.print("Введите номер месяца от 1 до 12: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 12 || i == 1 || i == 2) {
            System.out.println("Зима");
        } else if (i == 3 || i == 4 || i == 5) {
            System.out.println("Весна");
        } else if (i == 6 || i == 7 || i == 8) {
            System.out.println("Лето");
        } else if (i == 9 || i == 10 || i == 11) {
            System.out.println("Осень");
        } else if (i <= 0 || i >= 13 ) {
            System.out.println("Нет такого месяца");
        }

    }

}
