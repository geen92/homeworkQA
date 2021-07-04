package lesson3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("a: ");
        Scanner inputA = new Scanner(System.in);
        int a = inputA.nextInt();
        System.out.print("b: ");
        Scanner inputB = new Scanner(System.in);
        int b = inputB.nextInt();
        System.out.print("c: ");
        Scanner inputC = new Scanner(System.in);
        int c = inputC.nextInt();
        System.out.println( a + b > c && a + c > b && b + c > a ? "Треугольник существует" : "Треугольник не существует" );
    }
}
/*
Ввести с клавиатуры три числа а, b, c - стороны предполагаемого
треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами
существует.
"Треугольник не существует." - если треугольник с такими
сторонами не существует.
Подсказка:
Треугольник существует только тогда, когда сумма двух его
сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо
равна сумме двух других, то треугольника с такими сторонами не
существует.
*/
