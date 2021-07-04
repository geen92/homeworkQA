package lesson3other;

import java.io.*;

public class Task_4 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите цвет:");
        String color = bufferedReader.readLine();

        switch (color) {
            case "красный" -> System.out.println("Мой любимый цвет - красный");
            case "оранжевый" -> System.out.println("Мой любимый цвет - оранжевый");
            case "желтый" -> System.out.println("Мой любимый цвет - желтый");
            case "зеленый" -> System.out.println("Мой любимый цвет - зеленый");
            case "голубой" -> System.out.println("Мой любимый цвет - голубой");
            case "синий" -> System.out.println("Мой любимый цвет - синий");
            case "фиолетовый" -> System.out.println("Мой любимый цвет - фиолетовый");
            default -> System.out.println("У меня нет любимого цвета");
        }

//        if (color.equals("красный")){
//            System.out.println("Мой любимый цвет - красный");
//        }else if (color.equals("оранжевый")){
//            System.out.println("Мой любимый цвет - оранжевый");
//        }else if (color.equals("желтый")){
//            System.out.println("Мой любимый цвет - желтый");
//        }else if (color.equals("зеленый")){
//            System.out.println("Мой любимый цвет - зеленый");
//        }else if (color.equals("голубой")){
//            System.out.println("Мой любимый цвет - голубой");
//        }else if (color.equals("синий")){
//            System.out.println("Мой любимый цвет - синий");
//        }else if (color.equals("фиолетовый")){
//            System.out.println("Мой любимый цвет - фиолетовый");
//        }else{
//            System.out.println("У меня нет любимого цвета");
//        }

    }
}