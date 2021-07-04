//2) Создать массив целых чисел.
//В созданном массиве найти:
//а) среднее арифметическое
//b) сумму всех элементов
//с) количество элементов между максимальным и
//минимальным элементом.
//Вывести результаты в виде:
//“Среднее арифметическое”:5.5
//“Сумма всех элементов”: 345
//“Количество элементов между максимальным и минимальным
//элементом”: 5

package lesson6arrey;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[] {12,6,23,1,6,10,2,32,6,33};
        int sumOfMass = 0;
        for (int j : mass) {
            sumOfMass = sumOfMass + j;
        }
        double averageOfNumbersInMass = (double)sumOfMass / mass.length;
        System.out.println("”Среднее арифметическое”: " + averageOfNumbersInMass);
        System.out.println("”Сумма всех элементов”: " + sumOfMass);
        int minNumber = mass[0];
        int minIndex = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < minNumber) {
                minNumber = mass[i];
                minIndex = i;
            }
        }
//        System.out.println("Индекс минимально числа " + minIndex + "\nМинимальное число: " + minNumber);
        int maxNumber = mass[0];
        int maxIndex = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > maxNumber) {
                maxNumber = mass[i];
                maxIndex = i;
            }
        }
//        System.out.println("Индекс максимального числа " + maxIndex + "\nМаксимальное число: " + maxNumber);
        int elementBetweenMaxAndMin = (Math.abs(maxIndex - minIndex) - 1);
        System.out.println("”Количество элементов между максимальным и минимальным\nэлементом”: " + elementBetweenMaxAndMin);
    }
}
