package lesson3;

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        System.out.print("Любимый цвет: ");
        Scanner inputColor = new Scanner(System.in);
        String color = inputColor.nextLine();
        switch (color) {
            case "красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый" -> System.out.println("Мой любимый цвет - " + color);
            default -> System.out.println("У меня нет любимого цвета");
        }
    }
}