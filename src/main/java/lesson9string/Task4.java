//4) Ввести 10 строк с консоли. Вывести на консоль те строки, длина
//которых меньше средней.

package lesson9string;

import java.io.*;

public class Task4 {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введи 10 строк с консоли:");

        String a1 = bufferedReader.readLine();
        String a2 = bufferedReader.readLine();
        String a3 = bufferedReader.readLine();
        String a4 = bufferedReader.readLine();
        String a5 = bufferedReader.readLine();
        String a6 = bufferedReader.readLine();
        String a7 = bufferedReader.readLine();
        String a8 = bufferedReader.readLine();
        String a9 = bufferedReader.readLine();
        String a10 = bufferedReader.readLine();

        char[] b1 = a1.toCharArray();
        char[] b2 = a2.toCharArray();
        char[] b3 = a3.toCharArray();
        char[] b4 = a4.toCharArray();
        char[] b5 = a5.toCharArray();
        char[] b6 = a6.toCharArray();
        char[] b7 = a7.toCharArray();
        char[] b8 = a8.toCharArray();
        char[] b9 = a9.toCharArray();
        char[] b10 = a10.toCharArray();

        int sum = (b1.length + b2.length + b3.length + b4.length + b5.length + b6.length + b7.length + b8.length + b9.length + b10.length) / 10;

        if (b1.length < sum) {
            System.out.println(a1);
        } if  (b2.length < sum) {
            System.out.println(a2);
        } if  (b3.length < sum) {
            System.out.println(a3);
        } if  (b4.length < sum) {
            System.out.println(a4);
        } if  (b5.length < sum) {
            System.out.println(a5);
        } if  (b6.length < sum) {
            System.out.println(a6);
        } if  (b7.length < sum) {
            System.out.println(a7);
        } if  (b8.length < sum) {
            System.out.println(a8);
        } if  (b9.length < sum) {
            System.out.println(a9);
        } if  (b10.length < sum) {
            System.out.println(a10);
        }
    }
}

//import java.io.*;
//
//public class Task4 {
//
//    public static void main(String[] args) throws IOException {
//
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        String[] array = new String[10];
//
//        System.out.println("Введите 10 значений массива: ");
//        for (int i = 0; i < 10; i++) {
//            String arrayNumbers = bufferedReader.readLine();
//            array[i] = arrayNumbers;
//        }
//        int totalLength = 0;
//        for (int i = 0; i < array.length; i++){
//            totalLength += array[i].length();
//        }
//        int averageLength = totalLength / array.length;
//
//        for (int i = 0; i < array.length; i++){
//            if (array[i].length() < averageLength){
//                System.out.print(array[i] + " ");
//            }
//        }
//    }
//}
