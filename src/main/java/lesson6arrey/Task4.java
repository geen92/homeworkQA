//4) Создать массив целых чисел. Отсортировать массив по
//убыванию(не использовать метод Arrays.sort()).
//Вывести массив до сортировки и после сортировки.
//Массив после сортировки вывести тремя способами:
//а) с помощью цикла for
//b) с помощью цикла foreach
//c) с помощью метода из класса Arrays

package lesson6arrey;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mass = {12, 6, 23, 9, 3, 4, 21};
        for (int j = 0; j < mass.length - 1; j++) {
            for (int i = 0; i < mass.length - 1; i++)
            if(mass[i] > mass[i + 1]) {
                int s = mass[i + 1];
                mass[i + 1] = mass[i];
                mass[i] = s;
        }
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mass.length-1; i++) {
//                if(mass[i] < mass[i+1]){
//                    isSorted = false;
//                    buf = mass[i];
//                    mass[i] = mass[i+1];
//                    mass[i+1] = buf;
//                }
//            }
        }
        System.out.println("Сортировка по убыванию цикл for: ");
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
    }
        System.out.println("Сортировка по убыванию цикл for each: ");
        for (int i:mass) {
            System.out.println(i);
    }
        System.out.println("Сортировка по убыванию цикл Arrays.toString: " + Arrays.toString(mass));
    }
}
