package methods;

import java.io.*;

public class Task2 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String inputNumber = bufferedReader.readLine();
        double x = Integer.parseInt(inputNumber);

            double s = Math.sqrt(x);
            System.out.println("s=" + Math.sqrt(x));
            System.out.println("s=" + (Math.pow(s, x) + 4.0));
    }
}



