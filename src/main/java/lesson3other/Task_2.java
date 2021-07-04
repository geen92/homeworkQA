package lesson3other;

import java.io.*;

public class Task_2 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите номер месяца:");
        String numberMonth = bufferedReader.readLine();
        int numberMonth_int = Integer.parseInt(numberMonth);

        if ((numberMonth_int >= 1) && (numberMonth_int <= 3)){
            System.out.println("Зима");
        }else if((numberMonth_int >= 4) && (numberMonth_int <= 6)){
            System.out.println("Весна");
        }else if((numberMonth_int >= 7) && (numberMonth_int <= 9)){
            System.out.println("Лето");
        }else if((numberMonth_int >= 10) && (numberMonth_int <= 12)){
            System.out.println("Осень");
        }else {
            System.out.println("Нет такого времени года");
        }

    }
}