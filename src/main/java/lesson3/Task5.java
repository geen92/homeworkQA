package lesson3;/*
Ввести с клавиатуры строку.
Если строка соответствует слову “красный”, вывести на
консоль “Мой любимый цвет - красный”
Если строка соответствует слову оранжевый, вывести на
консоль “Мой любимый цвет- оранжевый”
Если строка соответствует слову желтый, вывести на консоль
“Мой любимый цвет - желтый”
Если строка соответствует слову зеленый, вывести на консоль
“Мой любимый цвет- зеленый”
Если строка соответствует слову голубой, вывести на консоль
“Мой любимый цвет - голубой”
Если строка соответствует слову синий, вывести на консоль
“Мой любимый цвет - синий”
Если строка соответствует слову фиолетовый, вывести на
консоль “Мой любимый цвет - фиолетовый”
Если строка не соответствует ни одному цвету, то вывести “У
меня нет любимого цвета”
*/
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Любимый цвет: ");
        Scanner inputColor = new Scanner(System.in);
        String color;
        String favoriteColor = "Мой любимый цвет - ";
        String noColor = "У меня нет любимого цвета";
        color = inputColor.nextLine();
        if (color.equals("красный")) {
            System.out.println(favoriteColor + color);
        }
        else if (color.equals("оранжевый"))
        {
            System.out.println(favoriteColor + color);}
        else if (color.equals("желтый"))
        {
            System.out.println(favoriteColor + color);}
        else if (color.equals("зеленый"))
        {
            System.out.println(favoriteColor + color);}
        else if (color.equals("голубой"))
        {
            System.out.println(favoriteColor + color);}
        else if (color.equals("синий"))
        {
            System.out.println(favoriteColor + color);}
        else if (color.equals("фиолетовый"))
        {
            System.out.println(favoriteColor + color);
        } else {
            System.out.println(noColor);
        }
    }
}
