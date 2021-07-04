package lesson3other;
import java.io.*;
public class Advanced_task {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Введите сторону 'a':");
        String a_string = bufferedReader.readLine();
        int a = Integer.parseInt(a_string);
        System.out.println("Введите сторону 'b':");
        String b_string = bufferedReader.readLine();
        int b = Integer.parseInt(b_string);
        System.out.println("Введите сторону 'c':");
        String c_string = bufferedReader.readLine();
        int c = Integer.parseInt(c_string);

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}