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

//import java.io.*;
//public class Task2 {
//    public static void main(String[] args) throws IOException {
//
//        InputStream inputStream = System.in;
//        Reader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        System.out.println("Введите первое слово состоящее из четного кол-ва букв :");
//        String firstWord = bufferedReader.readLine();
//        System.out.println("Введите второе слово состоящее из четного кол-ва букв :");
//        String secondWord = bufferedReader.readLine();
//
//        String resultingWord = (firstWord.substring(0, firstWord.length()/2)) + (secondWord.substring(secondWord.length()/2));
//        System.out.println(resultingWord);
//    }
//}