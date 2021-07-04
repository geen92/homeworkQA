import java.util.Scanner;

public class HourMinuteAndSecondsInSeconds {
    public static void main(String[] args) {
        System.out.println("____________________________________________");
        System.out.println("Программа вычесляет общее количество секунд");
        System.out.println("____________________________________________");
        System.out.print("Сколько часов?: ");
        Scanner inputHour = new Scanner(System.in);
        int hour = inputHour.nextInt();
        System.out.print("Сколько минут?: ");
        Scanner inputMinute = new Scanner(System.in);
        int minute = inputMinute.nextInt();
        System.out.print("Сколько секунд?: ");
        Scanner inputSeconds = new Scanner(System.in);
        int seconds = inputSeconds.nextInt();
        int hourInSecond = (60 * hour) * 60;
        int minuteInSecond = 60 * minute;
        int result = hourInSecond + minuteInSecond + seconds;
        System.out.println("____________________________________________");
        System.out.println("Вычесленное колличестко секунд: " + result);
        System.out.println("____________________________________________");
    }
}
