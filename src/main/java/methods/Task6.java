package methods;

import java.io.*;

public class Task6 {

    public static void main(String[] args) throws IOException {

        Task6.displayTheMinimumNumber();
    }
    public static void displayTheMinimumNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String inputNumberA = bufferedReader.readLine();
        int a = Integer.parseInt(inputNumberA);
        String inputNumberB = bufferedReader.readLine();
        int b = Integer.parseInt(inputNumberB);
        String inputNumberC = bufferedReader.readLine();
        int c = Integer.parseInt(inputNumberC);
        String inputNumberD = bufferedReader.readLine();
        int d = Integer.parseInt(inputNumberD);
        String inputNumberE = bufferedReader.readLine();
        int e = Integer.parseInt(inputNumberE);
        int mathMinimum = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        System.out.println(mathMinimum);
        }
    }

