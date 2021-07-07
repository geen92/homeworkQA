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

        String[] expression = s3.split("\\s");
        int temp = 1;
        if (expression[1].equals("plus")) System.out.println(Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]));
        {
        } if ((expression[1].equals("minus"))) System.out.println(Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]));
        else System.out.println("Некорректное выражение!");
    }
}