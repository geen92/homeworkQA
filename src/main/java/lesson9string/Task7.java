//7) а) Дано два числа, например 3 и 56, необходимо составить
//следующие строки:
//3 + 56 = 59
//3 – 56 = -53
//3 * 56 = 168.
//Используем метод StringBuilder.append().
//б) Замените символ “=” на слово “равно”. Используйте методы
//StringBuilder.replace().

package lesson9string;

public class Task7 {
    public static void main(String[] args) {

        StringBuffer Buffer1 = new StringBuffer("3");
            Buffer1.append(" + ");
            Buffer1.append("56");
            Buffer1.append(" = ");
            Buffer1.append("59");
        System.out.println(Buffer1);

        StringBuffer Buffer2 = new StringBuffer("3");
            Buffer2.append(" - ");
            Buffer2.append("56");
            Buffer2.append(" = ");
            Buffer2.append("-53");
        System.out.println(Buffer2);

        StringBuffer Buffer3 = new StringBuffer("3");
            Buffer3.append(" * ");
            Buffer3.append("56");
            Buffer3.append(" = ");
            Buffer3.append("168");
        System.out.println(Buffer3);

        Buffer1.replace(7, 8, "равно");
        System.out.println(Buffer1);
        Buffer2.replace(7, 8, "равно");
        System.out.println(Buffer2);
        Buffer3.replace(7, 8, "равно");
        System.out.println(Buffer3);
    }
}
