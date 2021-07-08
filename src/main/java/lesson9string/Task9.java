//9) Дана строка “Versions: Java  5, Java 6, Java 7, Java 8, Java 12.”
//Найти все подстроки "Java X" и распечатать их. Использовать
//регулярные выражения

package lesson9string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String regularExpression = "Java\\s+\\d{1,2}";
        String inputString = "Versions: Java  5, Java 6, Java 7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher match = pattern.matcher(inputString);
        while (match.find()){
            System.out.println(match.group());
        }
    }
}
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Task9 {
//    public static void main(String[] args) {
//
//        String string = "Versions: Java 5, Java 6, Java 7, Java 8, Java 12.";
//        String patternString = "Java\\s+\\d{1,2}";
//        Pattern pattern = Pattern.compile(patternString);
//        Matcher matcher = pattern.matcher(string);
//        while(matcher.find()){
//            System.out.println(matcher.group());
//        }
//    }
//
//}