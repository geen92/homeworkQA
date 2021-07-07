package lesson3other;

import java.io.*;

public class Task_1 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Give points[0-100]:");
        String points = bufferedReader.readLine();
        int string_int = Integer.parseInt(points);



        if(string_int < 0){
            System.out.println("Grade: impossible!");
        }else if ((string_int >= 0) && (string_int <= 49)){
            System.out.println("Grade: falied");
        }else if ((string_int >= 50) && (string_int <= 59)){
            System.out.println("Grade: 1");
        }else if ((string_int >= 60) && (string_int <= 69)) {
            System.out.println("Grade: 2");
        }else if ((string_int >= 70) && (string_int <= 79)) {
            System.out.println("Grade: 3");
        }else if ((string_int >= 80) && (string_int <= 89)) {
            System.out.println("Grade: 4");
        }else if ((string_int >= 90) && (string_int <= 100)) {
            System.out.println("Grade: 5");
        }else if (string_int >100) {
            System.out.println("Grade: incredible!");
        }
}
}


