//3) Посчитать результат выражений. Между числами могут быть
//слова только "plus" and "minus"
//String s1 = "1 plus 5";
//String s2 = "6 minus 5";
//String s3 = "8 plus 10";
//String s4 = "16 minus 5";
//Результат вывести на консоль в виде:
//“1 plus 5 = 6”

package lesson9string;

public class Task3 {
    public static void main(String[] args) {
        String s1 = "1 plus 5";
        String s2 = "6 minus 5";
        String s3 = "8 plus 10";
        String s4 = "16 minus 5";

        String[] expression = s2.split("\\s");
        int temp = 0;
        if (expression[1].contains("plus"))
        {
            temp = (Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]));
            System.out.println(s2 + " = " + temp);
        }
        else if ((expression[1].contains("minus")))
        {
            temp = (Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]));
            System.out.println(s2 + " = " + temp);
        }
        else System.out.println("Некорректное выражение!");
    }
}