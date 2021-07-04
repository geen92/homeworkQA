package lesson3other;

import java.io.*;

public class Task_3 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String number = bufferedReader.readLine();
        int number_int = Integer.parseInt(number);
        System.out.println("Введенное число: " + number_int);

        if(number_int > 0){
            number_int = number_int * 2;
        }else if (number_int < 0){
            number_int++;
        }
        System.out.println("Число после преобразований: " + number_int);
        System.out.println("DONE");

    }
}