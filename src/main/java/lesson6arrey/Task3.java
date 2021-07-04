//3) Найти минимальный элемент в массиве целых чисел.
//Длину массива и числа ввести с консоли.
//В результате вывести в консоль:
//“Минимальное число: 5”

package lesson6arrey;

public class Task3 {
    public static void main(String[] args) {
        int[] mass = new int[] {12,6,23,4,6,10,2,32,6,33};
        int minNumber = mass[0];
        for (int j : mass) {
            if (j < minNumber) {
                minNumber = j;
            }
        }
        System.out.println("Минимальное число: " + minNumber + "\nДлинна массива: " + mass.length);
    }
}
