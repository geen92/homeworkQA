//2)  Условие задачи: ввести 2 слова с клавиатуры, состоящие из
//четного числа букв. Получить слово состоящее из первой половины
//первого слова и второй половины второго слова. Вывести
//полученное слово на экран
//String a = “1122”;
//String b = “3344”;
//”Result: 1144”

package lesson9string;

public class Task2 {
    public static void main(String[] args) {
        String a = "1122";
        String b = "3344";
        String Result = "Result: " + (a.charAt(0)) + (a.charAt(1)) + (b.charAt(2)) + (b.charAt(3));

        System.out.println(Result);

    }
}
